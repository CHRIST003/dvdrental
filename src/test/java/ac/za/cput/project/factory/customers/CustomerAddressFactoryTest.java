package ac.za.cput.project.factory.customers;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.factory.customers.CustomerAddressFactory;
import org.junit.Test;

public class CustomerAddressFactoryTest {

    @Test
    public void getCustomerAddress() {

        CustomerAddress a = CustomerAddressFactory.getCustomerAddress("82 rosmead Avenue, kenilworth","82 rosmead Avenue, kenilworth",7780);
        System.out.println(a);
    }
}