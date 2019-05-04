package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Login;
import ac.za.cput.project.LoginFactory;
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
