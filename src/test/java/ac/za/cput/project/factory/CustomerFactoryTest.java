package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    @Test
    public void createCustomer() {

        Customer customer = CustomerFactory.CreateCustomer("Members");
        customer.typeOfCustomer();
    }
}