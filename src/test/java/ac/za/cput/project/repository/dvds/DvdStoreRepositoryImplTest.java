package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.factory.dvds.DvdStoreFactory;
import ac.za.cput.project.repository.dvds.DvdStoreRepository;
import ac.za.cput.project.repository.dvds.impl.DvdStoreRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DvdStoreRepositoryImplTest {

    private DvdStoreRepository repository;
    private DvdStore dvdStore;

    private DvdStore getSavedDvdStore() {
        Set<DvdStore> savedDvdStore = this.repository.getAll();
        return savedDvdStore.iterator().next();
    }


    @Before
    public void setUp() throws Exception {

        this.repository = DvdStoreRepositoryImpl.getRepository();
        this.dvdStore = DvdStoreFactory.getDvdStore("NMCA MOVIE WORLD","82 rosmead avenue, Kenilworth");
    }

    @Test
    public void create() {

        DvdStore created = this.repository.create(this.dvdStore);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.dvdStore);
    }

    @Test
    public void update() {

        String newname = "New DvdStore Name";
        String newAddresse = "New DvdStore Addresse";
        DvdStore dvdStore = new DvdStore.Builder().copy(getSavedDvdStore())
                .name(newname)
                .address(newAddresse)
                .build();
        System.out.println("In update, about_to_updated = " + dvdStore);
        DvdStore updated = this.repository.update(dvdStore);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getName());
        Assert.assertSame(newname, updated.getAddress());
        getAll();
    }

    @Test
    public void delete() {

        DvdStore savedDvdStore = getSavedDvdStore();
        this.repository.delete(savedDvdStore.getName());
        getAll();
    }

    @Test
    public void read() {

        DvdStore savedDvdStore = getSavedDvdStore();
        System.out.println("In read, courseId = "+ savedDvdStore.getName());
        DvdStore read = this.repository.read(savedDvdStore.getName());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedDvdStore, read);
    }

    @Test
    public void getAll() {

        Set<DvdStore> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}