package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.domain.dvds.OldRelease;
import ac.za.cput.project.factory.dvds.OldReleaseFactory;
import ac.za.cput.project.repository.dvds.impl.OldReleaseRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OldReleaseServiceImplTest {

    private OldReleaseRepositoryImpl repository;
    private OldRelease oldRelease;

    private OldRelease getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = OldReleaseRepositoryImpl.getRepository();
        this.oldRelease = OldReleaseFactory.getOldRelease("7658","Amazon",700,true,
                "Action","20/05/2019");
    }

    @Test
    public void getAll() {

        Set<OldRelease> oldReleases = this.repository.getAll();
        System.out.println("In getall, all = " + oldReleases);
    }

    @Test
    public void create() {

        OldRelease created = this.repository.create(this.oldRelease);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.oldRelease);
    }

    @Test
    public void update() {

        String newTitle = "Matrix 00";
        OldRelease updated = new OldRelease.Builder().copy(getSaved())
                .Title(newTitle)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTitle, updated.getTitle());
    }

    @Test
    public void delete() {
        OldRelease saved = getSaved();
        this.repository.delete(saved.getDvdID());
        getAll();
    }

    @Test
    public void read() {

        OldRelease saved = getSaved();
        OldRelease read = this.repository.read(saved.getDvdID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}