package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.factory.customers.MembersFactory;
import ac.za.cput.project.repository.customers.impl.MembersRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MembersServiceImplTest {

    private MembersRepositoryImpl repository;
    private Members members;

    private Members getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = MembersRepositoryImpl.getRepository();
        this.members = MembersFactory.getMembers("7654","Amour","Nganga",
                true,true,600,"Members");
    }

    @Test
    public void getAll() {

        Set<Members> members = this.repository.getAll();
        System.out.println("In getall, all = " + members);
    }

    @Test
    public void create() {

        Members created = this.repository.create(this.members);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.members);
    }

    @Test
    public void update() {

        String newName = "Christ";
        Members updated = new Members.Builder().copy(getSaved())
                .Name(newName)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());
    }

    @Test
    public void delete() {
        Members saved = getSaved();
        this.repository.delete(saved.getCustID());
        getAll();
    }

    @Test
    public void read() {

        Members saved = getSaved();
        Members read = this.repository.read(saved.getCustID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}