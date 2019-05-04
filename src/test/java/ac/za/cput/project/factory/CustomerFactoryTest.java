package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Customer;
import ac.za.cput.project.CustomerFactory;
import org.junit.Test;

public class CustomerFactoryTest {

    @Test
    public void createCustomer() {

        Customer customer = CustomerFactory.CreateCustomer("Members");
        customer.typeOfCustomer();
    }
}