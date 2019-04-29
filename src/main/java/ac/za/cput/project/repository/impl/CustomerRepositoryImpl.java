package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.Customer;
import ac.za.cput.project.repository.CustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> customers;

    private CustomerRepositoryImpl(){
        this.customers = new HashSet<>();
    }

    public static CustomerRepositoryImpl getRepository(){

        if(repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }


    @Override
    public Customer create(Customer customer) {
        this.customers.add(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Customer read(String s) {
        return null;
    }

    @Override
    public Set<Customer> getAll() {
        return this.customers;
    }
}
