package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Romance;
import ac.za.cput.project.factory.categories.RomanceFactory;
import ac.za.cput.project.repository.categories.impl.RomanceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RomanceServiceImplTest {

    private RomanceRepositoryImpl repository;
    private Romance romance;

    private Romance getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = RomanceRepositoryImpl.getRepository();
        this.romance = RomanceFactory.getRomance("3242", "Action", "War");
    }

    @Test
    public void getAll() {

        Set<Romance> romances = this.repository.getAll();
        System.out.println("In getall, all = " + romances);
    }

    @Test
    public void create() {

        Romance created = this.repository.create(this.romance);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.romance);
    }

    @Test
    public void update() {

        String newName = "Delta Force", newDescription = "the best ever";
        Romance updated = new Romance.Builder().copy(getSaved())
                .Name(newName)
                .Description(newDescription)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());

    }

    @Test
    public void delete() {

        Romance saved = getSaved();
        this.repository.delete(saved.getCategoryID());
        getAll();
    }

    @Test
    public void read() {

        Romance saved = getSaved();
        Romance read = this.repository.read(saved.getCategoryID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}