package ac.za.cput.project.factory;


import ac.za.cput.project.domain.CustomerContact;

public class CustomerContactFactory {

    public static CustomerContact getCustomerContact(String phoneNumber) {
        return new CustomerContact.Builder()
                .phoneNumber(phoneNumber)
                .build();
    }
}
