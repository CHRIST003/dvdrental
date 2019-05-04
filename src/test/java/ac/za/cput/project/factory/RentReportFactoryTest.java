package ac.za.cput.project.factory;

import ac.za.cput.project.domain.RentReport;
import ac.za.cput.project.RentReportFactory;
import org.junit.Assert;
import org.junit.Test;

public class RentReportFactoryTest {

    @Test
    public void getRentReport() {

        RentReport a = RentReportFactory.getRentReport("756543546","29/06/2019", "30/06/2019","45678"
        ,"465678",100.00);
        System.out.println(a);
        Assert.assertNotNull(a.getRentID());

    }
}
