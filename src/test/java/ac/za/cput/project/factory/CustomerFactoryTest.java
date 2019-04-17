package ac.za.cput.project.factory;

import ac.za.cput.project.domain.DvdStore;

public class CustomerFactoryTest {

    public static void main (String[]args){
        DvdStore ps = new DvdStore();
        ps.CreateCustomer("Member");
    }
}
