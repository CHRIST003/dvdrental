package ac.za.cput.project.service.useraccess.impl;

import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.factory.useraccess.LoginFactory;
import ac.za.cput.project.repository.useraccess.impl.LoginRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginServiceImplTest {

    private LoginRepositoryImpl repository;
    private Login login;

    private Login getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = LoginRepositoryImpl.getRepository();
        this.login = LoginFactory.getLogin("34554","Christ","nganga");
    }

    @Test
    public void getAll() {

        Set<Login> logins = this.repository.getAll();
        System.out.println("In getall, all = " + logins);
    }

    @Test
    public void create() {

        Login created = this.repository.create(this.login);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.login);
    }

    @Test
    public void update() {

        String newUserName = "Christ003";
        String newPassword = "wise333";
        Login updated = new Login.Builder().copy(getSaved())
                .userName(newUserName)
                .password(newPassword)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newUserName, updated.getUserName());
        Assert.assertSame(newPassword, updated.getPassword());
    }

    @Test
    public void delete() {

        Login saved = getSaved();
        this.repository.delete(saved.getLoginID());
        getAll();

    }

    @Test
    public void read() {

        Login saved = getSaved();
        Login read = this.repository.read(saved.getLoginID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}