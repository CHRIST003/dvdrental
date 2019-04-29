package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.CustomerContact;
import ac.za.cput.project.repository.CustomerContactRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerContactRepositoryImpl implements CustomerContactRepository {


    private static CustomerContactRepositoryImpl repository = null;
    private Set<CustomerContact> customerContacts;

    private CustomerContactRepositoryImpl(){
        this.customerContacts = new HashSet<>();
    }

    public static CustomerContactRepositoryImpl getRepository(){

        if(repository == null) repository = new CustomerContactRepositoryImpl();
        return repository;
    }


    @Override
    public CustomerContact create(CustomerContact customerContact) {
        this.customerContacts.add(customerContact);
        return customerContact;
    }

    @Override
    public CustomerContact update(CustomerContact customerContact) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public CustomerContact read(String s) {
        return null;
    }

    @Override
    public Set<CustomerContact> getAll() {
        return this.customerContacts;
    }
}
