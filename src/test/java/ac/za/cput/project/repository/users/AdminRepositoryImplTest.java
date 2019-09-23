package ac.za.cput.project.repository.users;

import ac.za.cput.project.domain.users.Admin;
import ac.za.cput.project.factory.users.AdminFactory;
import ac.za.cput.project.repository.users.impl.AdminRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdminRepositoryImplTest {

    private AdminRepository repository;
    private Admin admin;


    private Admin getSavedAdmin(){
        Set<Admin> savedAdmins = this.repository.getAll();
        return savedAdmins.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = AdminRepositoryImpl.getRepository();
        this.admin = AdminFactory.getAdmin("546576","Christ Amour","Nganga");
    }

    @Test
    public void create() {

        Admin created = this.repository.create(this.admin);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.admin);
    }

    @Test
    public void update() {
        String newName = "Admin new name";
        String newLastName = " Admin new LastName";
        Admin admin = new Admin.Builder().copy(getSavedAdmin()).name(newName).LastName(newLastName).build();
        System.out.println("In update, about_to_updated = " + admin);
        Admin updated = this.repository.update(admin);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getName());
        Assert.assertSame(newLastName, updated.getLastName());
        getAll();
    }

    @Test
    public void delete() {
     Admin savedAdmin = getSavedAdmin();
     this.repository.delete(savedAdmin.getAdID());
     getAll();

    }

    @Test
    public void read() {

        Admin savedAdmin = getSavedAdmin();
        System.out.println("In read, courseId = "+savedAdmin.getAdID());
        Admin read = this.repository.read(savedAdmin.getAdID());
        System.out.println("In read, read = "+ read);
        getAll();
        Assert.assertEquals(savedAdmin,read);
    }

    @Test
    public void getAll() {
        Set<Admin> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}