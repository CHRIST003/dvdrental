package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.domain.customers.NormalCustomer;
import ac.za.cput.project.factory.customers.NormalCustomerFactory;
import ac.za.cput.project.repository.customers.impl.NormalCustomerRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NormalCustomerServiceImplTest {

    private NormalCustomerRepositoryImpl repository;
    private NormalCustomer normalCustomer;

    private NormalCustomer getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = NormalCustomerRepositoryImpl.getRepository();
        this.normalCustomer = NormalCustomerFactory.getNormalCustomer("7654", "Amour", "Nganga",
                true, true, 600, "Members");
    }

    @Test
    public void getAll() {

        Set<NormalCustomer> normalCustomers = this.repository.getAll();
        System.out.println("In getall, all = " + normalCustomers);
    }

    @Test
    public void create() {

        NormalCustomer created = this.repository.create(this.normalCustomer);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.normalCustomer);
    }

    @Test
    public void update() {

        String newName = "Christ";
        NormalCustomer updated = new NormalCustomer.Builder().copy(getSaved())
                .Name(newName)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());
    }

    @Test
    public void delete() {
        NormalCustomer saved = getSaved();
        this.repository.delete(saved.getCustID());
        getAll();
    }

    @Test
    public void read() {

        NormalCustomer saved = getSaved();
        NormalCustomer read = this.repository.read(saved.getCustID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}