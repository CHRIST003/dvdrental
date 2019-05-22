package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.factory.dvds.DvdStoreFactory;
import ac.za.cput.project.repository.dvds.impl.DvdStoreRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DvdStoreServiceImplTest {

    private DvdStoreRepositoryImpl repository;
    private DvdStore dvdStore;

    private DvdStore getSaved(){
        return this.repository.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception {

        this.repository = DvdStoreRepositoryImpl.getRepository();
        this.dvdStore = DvdStoreFactory.getDvdStore("Christ Movie World","Rosmead");
    }

    @Test
    public void getAll() {

        Set<DvdStore> dvdStores = this.repository.getAll();
        System.out.println("In getall, all = " + dvdStores);
    }

    @Test
    public void create() {

        DvdStore created = this.repository.create(this.dvdStore);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.dvdStore);
    }

    @Test
    public void update() {

        String newName = "World wide Movie";
        DvdStore updated = new DvdStore.Builder().copy(getSaved())
                .name(newName)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newName, updated.getName());
    }

    @Test
    public void delete() {

        DvdStore saved = getSaved();
        this.repository.delete(saved.getName());
        getAll();
    }

    @Test
    public void read() {

        DvdStore saved = getSaved();
        DvdStore read = this.repository.read(saved.getName());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}