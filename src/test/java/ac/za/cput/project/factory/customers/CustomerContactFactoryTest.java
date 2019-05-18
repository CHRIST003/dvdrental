package ac.za.cput.project.factory.customers;


import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.factory.customers.CustomerContactFactory;
import org.junit.Test;

public class CustomerContactFactoryTest {
    @Test
    public void getCustomerContact() {
        CustomerContact a = CustomerContactFactory.getCustomerContact("756543546");
        System.out.println(a);

    }
}
