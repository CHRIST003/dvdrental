package ac.za.cput.project.factory.customers;

import ac.za.cput.project.domain.customers.Members;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MembersFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getMembers() {

        Members a = MembersFactory.getMembers("Amour","Nganga", true, true ,400.00,
                "member");
        System.out.println(a);
        Assert.assertNotNull(a.getCustID());
    }
}