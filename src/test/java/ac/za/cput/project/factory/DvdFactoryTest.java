package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Dvd;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DvdFactoryTest {

    @Test
    public void getDvd() {
        String DvdId = "TY567";
        String title = "Thor";
        double price = 200.00;
        boolean AvailableForRent = true;
        Dvd a = DvdFactory.getDvd("Thor",200.00,true);
        System.out.println(a);
        Assert.assertNotNull(a.getDvdId());
    }
}