package ac.za.cput.project.factory;

import ac.za.cput.project.domain.DvdSoldList;
import org.junit.Assert;
import org.junit.Test;


public class DvdSoldListFactoryTest {

    @Test
    public void getDvdSoldList() {

        DvdSoldList a = DvdSoldListFactory.getDvdSoldList("756543546",5,500.00);
        System.out.println(a);
        Assert.assertNotNull(a.getDvdSaleListID());
    }
}