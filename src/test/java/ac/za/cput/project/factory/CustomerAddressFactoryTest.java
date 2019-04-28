package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Admin;
import ac.za.cput.project.domain.CustomerAddress;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerAddressFactoryTest {

    @Test
    public void getCustomerAddress() {

        CustomerAddress a = CustomerAddressFactory.getCustomerAddress("82 rosmead Avenue, kenilworth","82 rosmead Avenue, kenilworth",7780);
        System.out.println(a);
    }
}