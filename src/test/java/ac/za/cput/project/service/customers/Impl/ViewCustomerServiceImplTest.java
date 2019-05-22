package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.factory.customers.ViewCustomerFactory;
import ac.za.cput.project.repository.customers.impl.ViewCustomerRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ViewCustomerServiceImplTest {

    private ViewCustomerRepositoryImpl repository;
    private ViewCustomer viewCustomer;

    private ViewCustomer getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = ViewCustomerRepositoryImpl.getRepository();
        this.viewCustomer = ViewCustomerFactory.getViewCustomer("7899","Christ",
                "Nganga","0633073758",49000);
    }

    @Test
    public void getAll() {

        Set<ViewCustomer> viewCustomers = this.repository.getAll();
        System.out.println("In getall, all = " + viewCustomers);
    }

    @Test
    public void create() {

        ViewCustomer created = this.repository.create(this.viewCustomer);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.viewCustomer);
    }

    @Test
    public void update() {

        String newName = "Moussiessi";
        ViewCustomer updated = new ViewCustomer.Builder().copy(getSaved())
                .Name(newName)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());
    }

    @Test
    public void delete() {

        ViewCustomer saved = getSaved();
        this.repository.delete(saved.getCustID());
        getAll();
    }

    @Test
    public void read() {

        ViewCustomer saved = getSaved();
        ViewCustomer read = this.repository.read(saved.getCustID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}