package ac.za.cput.project.repository.sales;

import ac.za.cput.project.domain.sales.SaleReport;
import ac.za.cput.project.factory.sales.SaleReportFactory;
import ac.za.cput.project.repository.sales.SaleReportRepository;
import ac.za.cput.project.repository.sales.impl.SaleReportRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaleReportRepositoryImplTest {

    private SaleReportRepository repository;
    private SaleReport saleReport;

    private SaleReport getSavedSaleReport() {
        Set<SaleReport> savedSaleReports = this.repository.getAll();
        return savedSaleReports.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = SaleReportRepositoryImpl.getRepository();
        this.saleReport = SaleReportFactory.getSaleReport("23434","30/03/2019","2344",
                "Merveille","6789",3,600);

    }

    @Test
    public void create() {

        SaleReport created = this.repository.create(this.saleReport);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.saleReport);


    }

    @Test
    public void update() {

        String newDate = "New Sale date", newCustID ="New Customer ID", newCustName="New Customer Name", newDvdID="New Dvd ID";
        int newQtyOfDvd = 4;
        double newTotalOfMoneyPaid = 3000.00;

        SaleReport saleReport = new SaleReport.Builder().copy(getSavedSaleReport())
                .date(newDate)
                .CustID(newCustID)
                .CustName(newCustName)
                .DvdID(newDvdID)
                .QtyOfDvd(newQtyOfDvd)
                .TotalOfMoneyPaid(newTotalOfMoneyPaid)
                .build();
        System.out.println("In update, about_to_updated = " + saleReport);
        SaleReport updated = this.repository.update(saleReport);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newDate, updated.getDate());
        Assert.assertSame(newCustID, updated.getCustID());
        Assert.assertSame(newCustName, updated.getCustName());
        Assert.assertSame(newDvdID, updated.getDvdID());
        Assert.assertSame(newQtyOfDvd, updated.getQtyOfDvd());
        Assert.assertSame(newTotalOfMoneyPaid, updated.getTotalOfMoneyPaid());
        getAll();



    }

    @Test
    public void delete() {

        SaleReport savedSaleReport = getSavedSaleReport();
        this.repository.delete(savedSaleReport.getCustID());
        getAll();

    }

    @Test
    public void read() {

        SaleReport savedsaleReport = getSavedSaleReport();
        System.out.println("In read, SaleID = "+ savedsaleReport.getCustID());
        SaleReport read = this.repository.read(savedsaleReport.getCustID());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedsaleReport, read);


    }

    @Test
    public void getAll() {

        Set<SaleReport> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);

    }
}