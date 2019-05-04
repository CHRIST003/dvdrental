package ac.za.cput.project.factory;

import ac.za.cput.project.DvdFactory;
import ac.za.cput.project.domain.Dvd;
import org.junit.Test;

public class DvdFactoryTest {

    @Test
    public void createDvd() {

        Dvd dvd = DvdFactory.createDvd("oldRelease");
        dvd.showTypeOfDvd();
    }
}