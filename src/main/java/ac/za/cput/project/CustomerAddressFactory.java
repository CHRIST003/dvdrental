package ac.za.cput.project;

import ac.za.cput.project.domain.CustomerAddress;

public class CustomerAddressFactory {

    public static CustomerAddress getCustomerAddress( String physicalAddress, String postalAddress, int postCode){
        return new CustomerAddress.Builder()
                .physicalAddress(physicalAddress)
                .postalAddress(postalAddress)
                .postCode(postCode)
                .build();
    }
}
    ;