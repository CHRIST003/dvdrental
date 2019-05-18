package ac.za.cput.project.repository.sales;

import ac.za.cput.project.domain.sales.Sale;
import ac.za.cput.project.factory.sales.SaleFactory;
import ac.za.cput.project.repository.sales.SaleRepository;
import ac.za.cput.project.repository.sales.impl.SaleRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaleRepositoryImplTest {

    private SaleRepository repository;
    private Sale sale;

    private Sale getSavedSale() {
        Set<Sale> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }



    @Before
    public void setUp() throws Exception {

        this.repository = SaleRepositoryImpl.getRepository();
        this.sale = SaleFactory.getSale("5667","6788","5677","Amour","Moussiessi",
                633073758,2000.00,"Madassou","Horror",300.00);
    }

    @Test
    public void create() {

        Sale created = this.repository.create(this.sale);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.sale);
    }

    @Test
    public void update() {

        String newCustID = "New Customer ID", newDvdID="New Dvd ID", newCustName ="new Customer Name", newCustLastName ="New Customer Lastname",
                newDvdTitle ="New Dvd Title", newCategory = "New Dvd Category";
        long newPhoneNumber = 734566756;
        double newCustCredit = 1500.00;
        double newPrice = 130.00;
        Sale sale = new Sale.Builder().copy(getSavedSale()).CustID(newCustID)
                .DvdID(newDvdID)
                .CustName(newCustName).CustLastName(newCustLastName).DvdTitle(newDvdTitle).Categogy(newCategory)
                .phoneNumber(newPhoneNumber)
                .CustCredit(newCustCredit)
                .price(newPrice)
                .build();
        System.out.println("In update, about_to_updated = " + sale);
        Sale updated = this.repository.update(sale);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newCustID, updated.getCustID());
        Assert.assertSame(newDvdID, updated.getDvdID());
        Assert.assertSame(newCustName, updated.getCustName());
        Assert.assertSame(newCustLastName, updated.getCustLastName());
        Assert.assertSame(newDvdTitle, updated.getDvdTitle());
        Assert.assertSame(newCategory, updated.getCategogy());
        Assert.assertSame(newPhoneNumber, updated.getPhoneNumber());
        Assert.assertSame(newPrice, updated.getPrice());
        Assert.assertSame(newCustCredit, updated.getCustCredit());
        getAll();

    }

    @Test
    public void delete() {

        Sale savedCourse = getSavedSale();
        this.repository.delete(savedCourse.getSaleID());
        getAll();
    }

    @Test
    public void read() {

        Sale savedSale = getSavedSale();
        System.out.println("In read, courseId = "+ savedSale.getSaleID());
        Sale read = this.repository.read(savedSale.getSaleID());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedSale, read);
    }

    @Test
    public void getAll() {
        Set<Sale> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}