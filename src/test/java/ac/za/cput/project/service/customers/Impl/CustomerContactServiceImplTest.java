package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.factory.customers.CustomerContactFactory;
import ac.za.cput.project.repository.customers.impl.CustomerContactRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerContactServiceImplTest {

    private CustomerContactRepositoryImpl repository;
    private CustomerContact customerContact;

    private CustomerContact getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = CustomerContactRepositoryImpl.getRepository();
        this.customerContact = CustomerContactFactory.getCustomerContact("06330737358");
    }

    @Test
    public void getAll() {

        Set<CustomerContact> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }

    @Test
    public void create() {

        CustomerContact created = this.repository.create(this.customerContact);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.customerContact);
    }

    @Test
    public void update() {

        String newPhoneNumber = "066671734";
        CustomerContact updated = new CustomerContact.Builder().copy(getSaved())
                .phoneNumber(newPhoneNumber)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newPhoneNumber, updated.getPhoneNumber());
    }

    @Test
    public void delete() {

        CustomerContact saved = getSaved();
        this.repository.delete(saved.getPhoneNumber());
        getAll();
    }

    @Test
    public void read() {

        CustomerContact saved = getSaved();
        CustomerContact read = this.repository.read(saved.getPhoneNumber());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}