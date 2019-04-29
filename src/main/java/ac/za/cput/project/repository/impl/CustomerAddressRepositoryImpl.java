package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.CustomerAddress;
import ac.za.cput.project.repository.CustomerAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerAddressRepositoryImpl implements CustomerAddressRepository {


    private static CustomerAddressRepositoryImpl repository = null;
    private Set<CustomerAddress> customerAddresses;

    private CustomerAddressRepositoryImpl(){
        this.customerAddresses = new HashSet<>();
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
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public CustomerAddress read(String s) {
        return null;
    }

    @Override
    public Set<CustomerAddress> getAll() {
        return null;
    }
}
