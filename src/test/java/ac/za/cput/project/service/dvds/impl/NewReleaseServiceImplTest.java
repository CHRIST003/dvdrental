package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.factory.dvds.NewReleaseFactory;
import ac.za.cput.project.repository.dvds.impl.NewReleaseRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewReleaseServiceImplTest {

    private NewReleaseRepositoryImpl repository;
    private NewRelease newRelease;

    private NewRelease getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = NewReleaseRepositoryImpl.getRepository();
        this.newRelease = NewReleaseFactory.getNewRelease("7658","Amazon",700,true,
                "Action","20/05/2019");
    }

    @Test
    public void getAll() {

        Set<NewRelease> newReleases = this.repository.getAll();
        System.out.println("In getall, all = " + newReleases);
    }

    @Test
    public void create() {

        NewRelease created = this.repository.create(this.newRelease);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.newRelease);
    }

    @Test
    public void update() {

        String newTitle = "Matrix";
        NewRelease updated = new NewRelease.Builder().copy(getSaved())
                .Title(newTitle)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTitle, updated.getTitle());
    }

    @Test
    public void delete() {
        NewRelease saved = getSaved();
        this.repository.delete(saved.getDvdID());
        getAll();
    }

    @Test
    public void read() {

        NewRelease saved = getSaved();
        NewRelease read = this.repository.read(saved.getDvdID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}