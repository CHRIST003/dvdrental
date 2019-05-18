package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.sales.DvdSoldList;
import ac.za.cput.project.factory.sales.DvdSoldListFactory;
import ac.za.cput.project.repository.sales.DvdSoldListRepository;
import ac.za.cput.project.repository.sales.impl.DvdSoldListRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DvdSoldListRepositoryImplTest {

    private DvdSoldListRepository repository;
    private DvdSoldList dvdSoldList;

    private DvdSoldList getSavedDvdSoldList() {
        Set<DvdSoldList> savedDvdSoldList = this.repository.getAll();
        return savedDvdSoldList.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = DvdSoldListRepositoryImpl.getRepository();
        this.dvdSoldList = DvdSoldListFactory.getDvdSoldList("54678",5,600.00);
    }

    @Test
    public void create() {

        DvdSoldList created = this.repository.create(this.dvdSoldList);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.dvdSoldList);
    }

    @Test
    public void update() {

        int newQtyOfDvd = 6;
        double newTotal = 700;
        DvdSoldList dvdSoldList = new DvdSoldList.Builder().copy(getSavedDvdSoldList())
                .QtyOfDvd(newQtyOfDvd)
                .Total(newTotal)
                .build();
        System.out.println("In update, about_to_updated = " + dvdSoldList);
        DvdSoldList updated = this.repository.update(dvdSoldList);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newQtyOfDvd, updated.getQtyOfDvd());
        Assert.assertSame(newTotal, updated.getTotal());
        getAll();
    }

    @Test
    public void delete() {
        DvdSoldList savedDvdSoldList = getSavedDvdSoldList();
        this.repository.delete(savedDvdSoldList.getDvdSaleListID());
        getAll();
    }

    @Test
    public void read() {

        DvdSoldList savedDvdSoldList = getSavedDvdSoldList();
        System.out.println("In read, courseId = "+ savedDvdSoldList.getDvdSaleListID());
        DvdSoldList read = this.repository.read(savedDvdSoldList.getDvdSaleListID());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedDvdSoldList, read);
    }

    @Test
    public void getAll() {

        Set<DvdSoldList> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}