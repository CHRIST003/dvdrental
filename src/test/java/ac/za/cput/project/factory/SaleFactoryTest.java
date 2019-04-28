package ac.za.cput.project.factory;


import ac.za.cput.project.domain.Sale;
import org.junit.Assert;
import org.junit.Test;

public class SaleFactoryTest {
    @Test
    public void getSale() {

        Sale a = SaleFactory.getSale("756543546","86756","5456","christ","Nganga",633073758
        ,1000.00,"Thor","Action",200.00);
        System.out.println(a);
        Assert.assertNotNull(a.getSaleID());
    }
}
