package ac.za.cput.project.factory.sales;

import ac.za.cput.project.domain.sales.SaleReport;
import ac.za.cput.project.factory.sales.SaleReportFactory;
import org.junit.Assert;
import org.junit.Test;

public class SaleReportFactoryTest {
    @Test
    public void getSaleReportFactory() {

        SaleReport a = SaleReportFactory.getSaleReport("756543546","22/04/2019","8756","Christ","9867567"
        ,5678,500.00);
        System.out.println(a);
        Assert.assertNotNull(a.getSaleID());
    }
}
