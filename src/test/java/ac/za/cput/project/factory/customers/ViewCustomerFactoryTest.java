package ac.za.cput.project.factory.customers;


import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.factory.customers.ViewCustomerFactory;
import org.junit.Assert;
import org.junit.Test;

public class ViewCustomerFactoryTest {

    @Test
    public void getViewCustomer() {
        ViewCustomer a = ViewCustomerFactory.getViewCustomer("756543546","Christ","Nganga","0633073758",1000.00);
        System.out.println(a);
        Assert.assertNotNull(a.getCustID());
    }
}