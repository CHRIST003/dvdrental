package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.factory.customers.CustomerAddressFactory;
import ac.za.cput.project.repository.customers.impl.CustomerAddressRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerAddressServiceImplTest {

    private CustomerAddressRepositoryImpl repository;
    private CustomerAddress customerAddress;

    private CustomerAddress getSaved(){
        return this.repository.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception {

        this.repository = CustomerAddressRepositoryImpl.getRepository();
        this.customerAddress = CustomerAddressFactory.getCustomerAddress("3 Rosmead avenue","3 Rosmead avenue",7708);
    }

    @Test
    public void getAll() {

        Set<CustomerAddress> customerAddresses = this.repository.getAll();
        System.out.println("In getall, all = " + customerAddresses);
    }

    @Test
    public void create() {

        CustomerAddress created = this.repository.create(this.customerAddress);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.customerAddress);
    }

    @Test
    public void update() {

        String newPhysicalAddress = "3 protea road", newPostalAddress="3 protea road";
        int newPostcode = 7745;

        CustomerAddress updated = new CustomerAddress.Builder().copy(getSaved())
                .physicalAddress(newPhysicalAddress)
                .postalAddress(newPostalAddress)
                .postCode(newPostcode)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newPhysicalAddress, updated.getPhysicalAddress());
        Assert.assertSame(newPostalAddress, updated.getPostalAddress());
        Assert.assertSame(newPostcode, updated.getPostCode());
    }

    @Test
    public void delete() {

        CustomerAddress saved = getSaved();
        this.repository.delete(saved.getPhysicalAddress());
        getAll();
    }

    @Test
    public void read() {
        CustomerAddress saved = getSaved();
        CustomerAddress read = this.repository.read(saved.getPhysicalAddress());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}