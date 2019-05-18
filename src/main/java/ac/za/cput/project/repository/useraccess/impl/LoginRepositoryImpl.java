package ac.za.cput.project.repository.useraccess.impl;

import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.repository.useraccess.LoginRepository;

import java.util.HashSet;
import java.util.Set;

public class LoginRepositoryImpl implements LoginRepository {


    private static LoginRepositoryImpl repository = null;
    private Set<Login> logins;

    private LoginRepositoryImpl(){
        this.logins = new HashSet<>();
    }

    private Login findLogin(String LoginID){

        return this.logins.stream()
                .filter(login -> login.getLoginID().trim().equals(LoginID))
                .findAny()
                .orElse(null);
    }

    public static LoginRepositoryImpl getRepository(){

        if(repository == null) repository = new LoginRepositoryImpl();
        return repository;
    }

    @Override
    public Login create(Login login) {
        this.logins.add(login);
        return login;
    }

    @Override
    public Login update(Login login) {

        Login toDelete = findLogin(login.getLoginID());
        if(toDelete != null) {
            this.logins.remove(toDelete);
            return create(login);
        }

        return null;
    }

    @Override
    public void delete(String LoginID) {

        Login login = findLogin(LoginID);
        if (login != null) this.logins.remove(login);
    }

    @Override
    public Login read(final String LoginID) {
        Login login = findLogin(LoginID);
        return null;
    }

    @Override
    public Set<Login> getAll() {
        return this.logins;
    }
}
