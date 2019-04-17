package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Dvd;
import ac.za.cput.project.domain.Rent;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentFactoryTest {

    @Test
    public void getRent() {
        String rentId = "TY567";
        String custId = "C56789";
        String DvdId = "D56";
        Rent a = RentFactory.getRent("TY567","C56789","D56");
        System.out.println(a);
        Assert.assertNotNull(((Rent) a).getRentId());
    }
}