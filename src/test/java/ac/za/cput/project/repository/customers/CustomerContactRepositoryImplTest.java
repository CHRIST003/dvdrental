package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.factory.customers.CustomerContactFactory;
import ac.za.cput.project.repository.customers.CustomerContactRepository;
import ac.za.cput.project.repository.customers.impl.CustomerContactRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerContactRepositoryImplTest {

    private CustomerContactRepository repository;
    private CustomerContact customerContact;

    private CustomerContact getSavedCustomerContact() {
        Set<CustomerContact> savedCustomerContacts = this.repository.getAll();
        return savedCustomerContacts.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = CustomerContactRepositoryImpl.getRepository();
        this.customerContact = CustomerContactFactory.getCustomerContact("0633073758");
    }

    @Test
    public void create() {

        CustomerContact created = this.repository.create(this.customerContact);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.customerContact);
    }

    @Test
    public void update() {

        String newPhoneNumber = "New Customer phoneNumber";
        CustomerContact customerContact = new CustomerContact.Builder().copy(getSavedCustomerContact()).phoneNumber(newPhoneNumber).build();
        System.out.println("In update, about_to_updated = " + customerContact);
        CustomerContact updated = this.repository.update(customerContact);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newPhoneNumber, updated.getPhoneNumber());
        getAll();

    }

    @Test
    public void delete() {

        CustomerContact savedCustomerContact = getSavedCustomerContact();
        this.repository.delete(savedCustomerContact.getPhoneNumber());
        getAll();
    }

    @Test
    public void read() {
        CustomerContact savedCustomerContact = getSavedCustomerContact();
        System.out.println("In read, courseId = "+ savedCustomerContact.getPhoneNumber());
        CustomerContact read = this.repository.read(savedCustomerContact.getPhoneNumber());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCustomerContact, read);
    }

    @Test
    public void getAll() {

        Set<CustomerContact> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}