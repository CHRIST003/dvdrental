package ac.za.cput.project.service.rents.impl;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.factory.rents.RentFactory;
import ac.za.cput.project.repository.rents.impl.RentRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentServiceImplTest {

    private RentRepositoryImpl repository;
    private Rent rent;

    private Rent getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = RentRepositoryImpl.getRepository();
        this.rent = RentFactory.getRent("5655","8765","7678","Christ",
                "Nganga","06330733758",7000,"Thor",
                "action",300);
    }

    @Test
    public void getAll() {

        Set<Rent> rents = this.repository.getAll();
        System.out.println("In getall, all = " + rents);
    }

    @Test
    public void create() {

        Rent created = this.repository.create(this.rent);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.rent);
    }

    @Test
    public void update() {

        String newCustName = "Mouanda";
        Rent updated = new Rent.Builder().copy(getSaved())
                .CustName(newCustName)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCustName, updated.getCustName());
    }

    @Test
    public void delete() {

        Rent saved = getSaved();
        this.repository.delete(saved.getRentId());
        getAll();
    }

    @Test
    public void read() {

        Rent saved = getSaved();
        Rent read = this.repository.read(saved.getRentId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}