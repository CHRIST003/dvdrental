package ac.za.cput.project.factory.useraccess;

import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.factory.useraccess.LoginFactory;
import org.junit.Assert;
import org.junit.Test;

public class LoginFactoryTest {
    @Test
    public void getLogin() {

        Login a = LoginFactory.getLogin("756543546","Christ","Nganga");
        System.out.println(a);
        Assert.assertNotNull(((Login) a).getLoginID());
    }
}
