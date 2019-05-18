package ac.za.cput.project.factory.dvds;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.factory.dvds.DvdStoreFactory;
import org.junit.Test;

public class DvdStoreFactoryTest {


    @Test
    public void getDvdStore() {

        DvdStore d = DvdStoreFactory.getDvdStore("354667","CHRIST MOVIE STORE");
        System.out.println(d);

    }


}
