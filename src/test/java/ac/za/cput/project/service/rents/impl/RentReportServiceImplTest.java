package ac.za.cput.project.service.rents.impl;

import ac.za.cput.project.domain.rents.RentReport;
import ac.za.cput.project.factory.rents.RentReportFactory;
import ac.za.cput.project.repository.rents.impl.RentReportRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentReportServiceImplTest {

    private RentReportRepositoryImpl repository;
    private RentReport rentReport;

    private RentReport getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = RentReportRepositoryImpl.getRepository();
        this.rentReport = RentReportFactory.getRentReport("6767","02/09/2001",
                "03/09/2001","87865","7656",300);
    }

    @Test
    public void getAll() {

        Set<RentReport> rentReports = this.repository.getAll();
        System.out.println("In getall, all = " + rentReports);
    }

    @Test
    public void create() {

        RentReport created = this.repository.create(this.rentReport);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.rentReport);
    }

    @Test
    public void update() {

        String newReturnedDate = "04/09/2001";
        RentReport updated = new RentReport.Builder().copy(getSaved())
                .returnedDate(newReturnedDate)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newReturnedDate, updated.getReturnedDate());
    }

    @Test
    public void delete() {

        RentReport saved = getSaved();
        this.repository.delete(saved.getRentID());
        getAll();
    }

    @Test
    public void read() {

        RentReport saved = getSaved();
        RentReport read = this.repository.read(saved.getRentID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}