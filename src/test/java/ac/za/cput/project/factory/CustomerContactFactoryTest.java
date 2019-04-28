package ac.za.cput.project.factory;


import ac.za.cput.project.domain.CustomerContact;
import org.junit.Test;

public class CustomerContactFactoryTest {
    @Test
    public void getCustomerContact() {
        CustomerContact a = CustomerContactFactory.getCustomerContact("756543546");
        System.out.println(a);

    }
}
