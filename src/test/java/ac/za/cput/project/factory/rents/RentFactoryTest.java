package ac.za.cput.project.factory.rents;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.factory.rents.RentFactory;
import org.junit.Assert;
import org.junit.Test;

public class RentFactoryTest {

    @Test
    public void getRent() {
        Rent a = RentFactory.getRent("TY567","C56789","D56","Christ","Nganga","0633073758", 500.00,
                "Thor","Action", 100.00);
                  System.out.println(a);
                   Assert.assertNotNull(a.getRentId());
    }
}