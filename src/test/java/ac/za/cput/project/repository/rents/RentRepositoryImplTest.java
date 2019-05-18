package ac.za.cput.project.repository.rents;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.factory.rents.RentFactory;
import ac.za.cput.project.repository.rents.RentRepository;
import ac.za.cput.project.repository.rents.impl.RentRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentRepositoryImplTest {

    private RentRepository repository;
    private Rent rent;

    private Rent getSavedRent() {
        Set<Rent> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = RentRepositoryImpl.getRepository();
        this.rent = RentFactory.getRent("4567","5667","6787","Christ","nganga",
                "0633073758",5000.00,"Thor","horror",200.00);
    }

    @Test
    public void create() {

        Rent created = this.repository.create(this.rent);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.rent);
    }

    @Test
    public void update() {

        String newCustId = "New customer ID", newDvdId = "New DVD ID", newCustName = "New Customer Name", newCustLastName ="New customer lastname",
                newPhoneNumber = "Customer new phone Number", newDvdTitle = "New Dvd Title", newCategory = "New category of the DVD";
        double newCustomerCredit = 300.00, newPrice = 250.00;

        Rent rent = new Rent.Builder().copy(getSavedRent())
                .custId(newCustId)
                .DvdId(newDvdId)
                .CustName(newCustName)
                .CustLastName(newCustLastName).phoneNumber(newPhoneNumber).DvdTitle(newDvdTitle).category(newCategory)
                .customerCredit(newCustomerCredit).price(newPrice)
                .build();
        System.out.println("In update, about_to_updated = " + rent);
        Rent updated = this.repository.update(rent);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newCustId, updated.getCustId());
        Assert.assertSame(newDvdId, updated.getDvdId());
        Assert.assertSame(newCustName, updated.getCustName());
        Assert.assertSame(newCustLastName, updated.getCustLastName());
        Assert.assertSame(newPhoneNumber, updated.getPhoneNumber());
        Assert.assertSame(newDvdTitle, updated.getDvdTitle());
        Assert.assertSame(newCategory, updated.getCategory());
        Assert.assertSame(newCustomerCredit, updated.getCustomerCredit());
        Assert.assertSame(newPrice, updated.getPrice());
        getAll();


    }

    @Test
    public void delete() {

        Rent savedRent = getSavedRent();
        this.repository.delete(savedRent.getRentId());
        getAll();
    }

    @Test
    public void read() {

        Rent savedRent = getSavedRent();
        System.out.println("In read, courseId = "+ savedRent.getRentId());
        Rent read = this.repository.read(savedRent.getRentId());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedRent, read);
    }

    @Test
    public void getAll() {

        Set<Rent> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}