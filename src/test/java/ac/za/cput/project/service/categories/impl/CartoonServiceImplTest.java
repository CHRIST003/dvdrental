package ac.za.cput.project.service.categories.impl;


import ac.za.cput.project.domain.categories.Cartoon;
import ac.za.cput.project.factory.categories.CartoonFactory;
import ac.za.cput.project.repository.categories.impl.CartoonRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CartoonServiceImplTest {

    private CartoonRepositoryImpl repository;
    private Cartoon cartoon;

    private Cartoon getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = CartoonRepositoryImpl.getRepository();
        this.cartoon = CartoonFactory.getCartoon("3242","Action","War");
    }

    @Test
    public void getAll() {

        Set<Cartoon> cartoons = this.repository.getAll();
        System.out.println("In getall, all = " + cartoons);
    }

    @Test
    public void create() {

        Cartoon created = this.repository.create(this.cartoon);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.cartoon);
    }

    @Test
    public void update() {

        String newName = "Delta Force", newDescription = "the best ever";
        Cartoon updated = new Cartoon.Builder().copy(getSaved())
                .Name(newName)
                .Description(newDescription)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());

    }

    @Test
    public void delete() {

        Cartoon saved = getSaved();
        this.repository.delete(saved.getCategoryID());
        getAll();
    }

    @Test
    public void read() {

        Cartoon saved = getSaved();
        Cartoon read = this.repository.read(saved.getCategoryID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}