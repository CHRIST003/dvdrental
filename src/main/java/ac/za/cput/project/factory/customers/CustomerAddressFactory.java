package ac.za.cput.project.factory.customers;

import ac.za.cput.project.domain.customers.CustomerAddress;

public class CustomerAddressFactory {

    public static CustomerAddress getCustomerAddress( String physicalAddress, String postalAddress, int postCode){
        return new CustomerAddress.Builder()
                .physicalAddress(physicalAddress)
                .postalAddress(postalAddress)
                .postCode(postCode)
                .build();
    }
}
