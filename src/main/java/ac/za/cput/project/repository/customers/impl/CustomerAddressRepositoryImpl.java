package ac.za.cput.project.repository.customers.impl;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.repository.customers.CustomerAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerAddressRepositoryImpl implements CustomerAddressRepository {


    private static CustomerAddressRepositoryImpl repository = null;
    private Set<CustomerAddress> customerAddresses;

    private CustomerAddressRepositoryImpl(){
        this.customerAddresses = new HashSet<>();
    }

    private CustomerAddress findCustomerAddress(String physicalAddress) {
        return this.customerAddresses.stream()
                .filter(customerAddress -> customerAddress.getPhysicalAddress().trim().equals(physicalAddress))
                .findAny()
                .orElse(null);
    }

    public static CustomerAddressRepositoryImpl getRepository(){

        if(repository == null) repository = new CustomerAddressRepositoryImpl();
        return repository;
    }

    @Override
    public CustomerAddress create(CustomerAddress customerAddress) {

        this.customerAddresses.add(customerAddress);
        return customerAddress;
    }

    @Override
    public CustomerAddress update(CustomerAddress customerAddress) {

        CustomerAddress toDelete = findCustomerAddress(customerAddress.getPhysicalAddress());
        if(toDelete != null) {
            this.customerAddresses.remove(toDelete);
            return create(customerAddress);
        }
        return null;
    }

    @Override
    public void delete(String physicalAddress) {

        CustomerAddress customerAddress = findCustomerAddress(physicalAddress);
        if (customerAddress != null) this.customerAddresses.remove(customerAddress);

    }

    @Override
    public CustomerAddress read(final String physicalAddress) {

        CustomerAddress customerAddress = findCustomerAddress(physicalAddress);
        return customerAddress;
    }

    @Override
    public Set<CustomerAddress> getAll() {

        return this.customerAddresses;
    }
}
