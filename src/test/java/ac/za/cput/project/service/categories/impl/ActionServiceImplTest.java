package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Action;
import ac.za.cput.project.factory.categories.ActionFactory;
import ac.za.cput.project.repository.categories.impl.ActionRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;




@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ActionServiceImplTest {

    private ActionRepositoryImpl repository;
    private Action action;

    private Action getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = ActionRepositoryImpl.getRepository();
        this.action = ActionFactory.getAction("3242","Action","War");
    }

    @Test
    public void getAll() {

        Set<Action> actions = this.repository.getAll();
        System.out.println("In getall, all = " + actions);
    }

    @Test
    public void create() {

        Action created = this.repository.create(this.action);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.action);
    }

    @Test
    public void update() {

        String newName = "Delta Force", newDescription = "the best ever";
        Action updated = new Action.Builder().copy(getSaved())
                .Name(newName)
                .Description(newDescription)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());

    }

    @Test
    public void delete() {

        Action saved = getSaved();
        this.repository.delete(saved.getCategoryID());
        getAll();
    }

    @Test
    public void read() {

        Action saved = getSaved();
        Action read = this.repository.read(saved.getCategoryID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}