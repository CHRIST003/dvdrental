package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.Login;
import ac.za.cput.project.repository.LoginRepository;

import java.util.HashSet;
import java.util.Set;

public class LoginRepositoryImpl implements LoginRepository {


    private static LoginRepositoryImpl repository = null;
    private Set<Login> logins;

    private LoginRepositoryImpl(){
        this.logins = new HashSet<>();
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
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Login read(String s) {
        return null;
    }

    @Override
    public Set<Login> getAll() {
        return this.logins;
    }
}
