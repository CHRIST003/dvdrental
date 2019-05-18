package ac.za.cput.project.repository.useraccess;

import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.factory.useraccess.LoginFactory;
import ac.za.cput.project.repository.useraccess.LoginRepository;
import ac.za.cput.project.repository.useraccess.impl.LoginRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginRepositoryImplTest {

    private LoginRepository repository;
    private Login login;

    private Login getSavedLogin() {
        Set<Login> savedLogins = this.repository.getAll();
        return savedLogins.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = LoginRepositoryImpl.getRepository();
        this.login = LoginFactory.getLogin("6578","Christ","Nga@5358");
    }

    @Test
    public void create() {

        Login created = this.repository.create(this.login);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.login);
    }

    @Test
    public void update() {

        String newUserName = "New Login userName";
        String newPassword = "New Login password";
        Login login = new Login.Builder().copy(getSavedLogin())
                .userName(newUserName)
                .password(newPassword)
                .build();
        System.out.println("In update, about_to_updated = " + login);
        Login updated = this.repository.update(login);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newUserName, updated.getUserName());
        Assert.assertSame(newPassword, updated.getPassword());
        getAll();
    }

    @Test
    public void delete() {

        Login savedCourse = getSavedLogin();
        this.repository.delete(savedCourse.getLoginID());
        getAll();
    }

    @Test
    public void read() {

        Login savedLogin = getSavedLogin();
        System.out.println("In read, courseId = "+ getSavedLogin().getLoginID());
        Login read = this.repository.read(savedLogin.getLoginID());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedLogin, read);
    }

    @Test
    public void getAll() {

        Set<Login> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}