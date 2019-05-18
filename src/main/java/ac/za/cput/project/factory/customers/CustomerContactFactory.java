package ac.za.cput.project.factory.customers;


import ac.za.cput.project.domain.customers.CustomerContact;

public class CustomerContactFactory {

    public static CustomerContact getCustomerContact(String phoneNumber) {
        return new CustomerContact.Builder()
                .phoneNumber(phoneNumber)
                .build();
    }
}
