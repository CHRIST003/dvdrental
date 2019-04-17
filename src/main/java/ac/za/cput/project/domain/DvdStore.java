package ac.za.cput.project.domain;

import ac.za.cput.project.factory.CustomerFactory;

public class DvdStore {

    public Customer CreateCustomer(String typeOfCustomer){

        Customer c = CustomerFactory.CreateCustomer(typeOfCustomer);

        c.buyDvd();
        c.rent();

        return c;
    }
}
