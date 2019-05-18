package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.dvds.Dvd;
import ac.za.cput.project.factory.dvds.DvdFactory;
import ac.za.cput.project.repository.dvds.DvdRepository;
import ac.za.cput.project.repository.dvds.impl.DvdRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DvdRepositoryImplTest {

//    private DvdRepository repository;
//    private Dvd dvd;
//
//    private Dvd getSavedDvd(){
//
//        Set<Dvd> savedDvds = this.repository.getAll();
//        return savedDvds.iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//
//        this.repository = DvdRepositoryImpl.getRepository();
//        this.dvd = DvdFactory.createDvd("Test DVD");
//    }
//
//
//    @Test
//    public void create() {
//
//       Dvd created = this.repository.create(this.dvd);
//       System.out.println("In create, created = " + created);
//       getAll();
//       Assert.assertSame(created, this.dvd);
//    }
//
//    @Test
//    public void update() {
//
//      String newTitle = "The new Dvd title";
//      double newPrice = 500.00;
//      boolean newAvailableForRent = false;
//      String newType = "old";
//      String newDate = "12/03/1998";
//      Dvd dvd = new Dvd(54677,"Thor",500.00,false,"old","12/03/1998") {
//          @Override
//          public int getDvdID() {
//              return super.getDvdID();
//          }
//
//          @Override
//          public void showTypeOfDvd() {
//              super.showTypeOfDvd();
//          }
//      };
//
//    }
//
//    @Test
//    public void delete() {
//    }
//
//    @Test
//    public void read() {
//    }
//
//    @Test
//    public void getAll() {
//    }
}