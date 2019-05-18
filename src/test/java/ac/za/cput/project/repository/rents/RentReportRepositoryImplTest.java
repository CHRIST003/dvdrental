package ac.za.cput.project.repository.rents;

import ac.za.cput.project.domain.rents.RentReport;
import ac.za.cput.project.factory.rents.RentReportFactory;
import ac.za.cput.project.repository.rents.RentReportRepository;
import ac.za.cput.project.repository.rents.impl.RentReportRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentReportRepositoryImplTest {

    private RentReportRepository repository;
    private RentReport rentReport;

    private RentReport getSavedRentReport() {
        Set<RentReport> savedRentReports = this.repository.getAll();
        return savedRentReports.iterator().next();
    }


    @Before
    public void setUp() throws Exception {

        this.repository = RentReportRepositoryImpl.getRepository();
        this.rentReport = RentReportFactory.getRentReport("4323","03/02/2019","05/02/2019","243543",
                "54567",400.00);
    }

    @Test
    public void create() {

        RentReport created = this.repository.create(this.rentReport);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.rentReport);
    }

//    @Test
//    public void update() {
//
//
//
//    }

    @Test
    public void delete() {

        RentReport savedRentReport = getSavedRentReport();
        this.repository.delete(savedRentReport.getRentID());
        getAll();
    }

    @Test
    public void read() {

        RentReport savedRentReport = getSavedRentReport();
        System.out.println("In read, courseId = "+ savedRentReport.getRentID());
        RentReport read = this.repository.read(savedRentReport.getRentID());
        System.out.println("In read, read = " + read);
        getAll();
    }

    @Test
    public void getAll() {

        Set<RentReport> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}