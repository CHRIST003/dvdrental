package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Drama;
import ac.za.cput.project.factory.categories.DramaFactory;
import ac.za.cput.project.repository.categories.impl.DramaRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DramaServiceImplTest {

    private DramaRepositoryImpl repository;
    private Drama drama;

    private Drama getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = DramaRepositoryImpl.getRepository();
        this.drama = DramaFactory.getDrama("3242", "Action", "War");
    }

    @Test
    public void getAll() {

        Set<Drama> dramas = this.repository.getAll();
        System.out.println("In getall, all = " + dramas);
    }

    @Test
    public void create() {

        Drama created = this.repository.create(this.drama);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.drama);
    }

    @Test
    public void update() {

        String newName = "Delta Force", newDescription = "the best ever";
        Drama updated = new Drama.Builder().copy(getSaved())
                .Name(newName)
                .Description(newDescription)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());

    }

    @Test
    public void delete() {

        Drama saved = getSaved();
        this.repository.delete(saved.getCategoryID());
        getAll();
    }

    @Test
    public void read() {

        Drama saved = getSaved();
        Drama read = this.repository.read(saved.getCategoryID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}