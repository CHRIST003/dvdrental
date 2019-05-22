package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Horror;
import ac.za.cput.project.factory.categories.HorrorFactory;
import ac.za.cput.project.repository.categories.impl.HorrorRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HorrorServiceImplTest {

    private HorrorRepositoryImpl repository;
    private Horror horror;

    private Horror getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = HorrorRepositoryImpl.getRepository();
        this.horror = HorrorFactory.getHorror("3242", "Action", "War");
    }

    @Test
    public void getAll() {

        Set<Horror> horrors = this.repository.getAll();
        System.out.println("In getall, all = " + horrors);
    }

    @Test
    public void create() {

        Horror created = this.repository.create(this.horror);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.horror);
    }

    @Test
    public void update() {

        String newName = "Delta Force", newDescription = "the best ever";
        Horror updated = new Horror.Builder().copy(getSaved())
                .Name(newName)
                .Description(newDescription)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());

    }

    @Test
    public void delete() {

        Horror saved = getSaved();
        this.repository.delete(saved.getCategoryID());
        getAll();
    }

    @Test
    public void read() {

        Horror saved = getSaved();
        Horror read = this.repository.read(saved.getCategoryID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}