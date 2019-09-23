package ac.za.cput.project.repository.customers.impl;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.factory.customers.MembersFactory;
import ac.za.cput.project.repository.customers.MembersRepository;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MembersRepositoryImplTest {

    private MembersRepository repository;
    private Members members;

    /**
     * @return
     */
    @NotNull
    private Members getSavedMembers() {
        Set<Members> savedMemberss = this.repository.getAll();
        return savedMemberss.iterator().next();
    }


    @Before
    public void setUp() throws Exception{

        this.repository = MembersRepositoryImpl.getRepository();
        this.members = MembersFactory.getMembers("Christ", "Nganga", true, true, 400.00
        , "member");
    }


    @Test
    public void create() {

        Members created = this.repository.create(this.members);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.members);
    }

    @Test
    public void read() {

        Members savedMemberss = getSavedMembers();
        System.out.println("In read, courseId = "+ savedMemberss.getCustID());
        Members read = this.repository.read(savedMemberss.getCustID());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedMemberss, read);
    }

    @Test
    public void delete() {

        Members savedMembers = getSavedMembers();
        this.repository.delete(savedMembers.getCustID());
        getAll();
    }


    @Test
    public void update() {

        String newName = "newName";
        Members members = new Members.Builder().copy(getSavedMembers()).Name("newName")
                .build();
        System.out.println("In update, about_to_updated = " + members);
        Members updated = this.repository.update(members);
        System.out.println("In update, updated = " + updated);

        Assert.assertSame(newName, updated.getName());

        getAll();

    }


    @Test
    public void getAll() {
        Set<Members> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}