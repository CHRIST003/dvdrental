package ac.za.cput.project.repository.customers.impl;

import ac.za.cput.project.domain.customers.Customer;
import ac.za.cput.project.repository.customers.CustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> customers;

    private CustomerRepositoryImpl(){
        this.customers = new HashSet<>();
    }

    private Customer findCustomer(String CustID) {
        return this.customers.stream()
                .filter(customer -> customer.getCustID().trim().equals(CustID))
                .findAny()
                .orElse(null);
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

        Customer toDelete = findCustomer(customer.getCustID());
        if(toDelete != null) {
            this.customers.remove(toDelete);
            return create(customer);
        }
        return null;
    }

    @Override
    public void delete(String CustID) {

        Customer customer = findCustomer(CustID);
        if (customer != null) this.customers.remove(customer);

    }

    @Override
    public Customer read(final String CustID) {

        Customer customer = findCustomer(CustID);
        return customer;
    }

    @Override
    public Set<Customer> getAll() {
        return this.customers;
    }
}
