package ac.za.cput.project.factory.useraccess;


import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.util.Amr;

public class LoginFactory {

    public static Login getLogin(String LoginID, String userName, String password){
        return new Login.Builder().LoginID(Amr.generateId())
                .LoginID(LoginID)
                .userName(userName)
                .password(password)
                .build();
    }
}
