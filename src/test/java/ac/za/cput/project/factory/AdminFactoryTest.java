package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Admin;
import org.junit.Assert;
import org.junit.Test;

public class AdminFactoryTest {
    @Test
    public void getAdmin() {

        Admin a = AdminFactory.getAdmin("756543546","Christ","Nganga");
        System.out.println(a);
        Assert.assertNotNull(a.getAdID());
    }
}
