package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.factory.customers.CustomerAddressFactory;
import ac.za.cput.project.repository.customers.CustomerAddressRepository;
import ac.za.cput.project.repository.customers.impl.CustomerAddressRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerAddressRepositoryImplTest {

    private CustomerAddressRepository repository;
    private CustomerAddress customerAddress;

    private CustomerAddress getSavedCustomerAddress(){

        Set<CustomerAddress> savedCustomerAddress = this.repository.getAll();
        return savedCustomerAddress.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = CustomerAddressRepositoryImpl.getRepository();
        this.customerAddress = CustomerAddressFactory.getCustomerAddress("82 rosmead avenue, Kenilworth","82 rosmead avenue, Kenilworth",
         7708);
    }

    @Test
    public void create() {

        CustomerAddress created = this.repository.create(this.customerAddress);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.customerAddress);
    }

    @Test
    public void update() {

        String newPhysicalAddress ="03 protea road, Goodwood";
        String newPostalAddress = "03 protea road, Goodwood";
        int newPostCode = 7745;
        CustomerAddress customerAddress = new CustomerAddress.Builder().copy(getSavedCustomerAddress())
                .physicalAddress(newPhysicalAddress)
                .postalAddress(newPostalAddress)
                .postCode(newPostCode)
                .build();
        System.out.println("In update, about_to_updated = " + customerAddress);
        CustomerAddress updated = this.repository.update(customerAddress);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newPhysicalAddress, updated.getPhysicalAddress());
        Assert.assertSame(newPostalAddress, updated.getPostalAddress());
        Assert.assertSame(newPostCode, updated.getPostCode());
        getAll();

    }

    @Test
    public void delete() {
        CustomerAddress savedCustomerAddress = getSavedCustomerAddress();
        this.repository.delete(savedCustomerAddress.getPhysicalAddress());
        getAll();
    }

    @Test
    public void read() {

        CustomerAddress savedCustomerAddress = getSavedCustomerAddress();
        System.out.println("In read, courseId = "+ savedCustomerAddress.getPhysicalAddress());
        CustomerAddress read = this.repository.read(savedCustomerAddress.getPhysicalAddress());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCustomerAddress, read);
    }

    @Test
    public void getAll() {
        Set<CustomerAddress> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}