package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Comedy;
import ac.za.cput.project.factory.categories.ComedyFactory;
import ac.za.cput.project.repository.categories.impl.ComedyRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ComedyServiceImplTest {

    private ComedyRepositoryImpl repository;
    private Comedy comedy;

    private Comedy getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = ComedyRepositoryImpl.getRepository();
        this.comedy = ComedyFactory.getComedy("3242", "Action", "War");
    }

    @Test
    public void getAll() {

        Set<Comedy> comedies = this.repository.getAll();
        System.out.println("In getall, all = " + comedies);
    }

    @Test
    public void create() {

        Comedy created = this.repository.create(this.comedy);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.comedy);
    }

    @Test
    public void update() {

        String newName = "Delta Force", newDescription = "the best ever";
        Comedy updated = new Comedy.Builder().copy(getSaved())
                .Name(newName)
                .Description(newDescription)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());

    }

    @Test
    public void delete() {

        Comedy saved = getSaved();
        this.repository.delete(saved.getCategoryID());
        getAll();
    }

    @Test
    public void read() {

        Comedy saved = getSaved();
        Comedy read = this.repository.read(saved.getCategoryID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}