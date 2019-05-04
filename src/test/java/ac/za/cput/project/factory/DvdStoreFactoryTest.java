package ac.za.cput.project.factory;

import ac.za.cput.project.DvdStoreFactory;
import ac.za.cput.project.domain.DvdStore;
import org.junit.Test;

public class DvdStoreFactoryTest {


    @Test
    public void getDvdStore() {

        DvdStore d = DvdStoreFactory.getDvdStore("354667","CHRIST MOVIE STORE");
        System.out.println(d);

    }


}
