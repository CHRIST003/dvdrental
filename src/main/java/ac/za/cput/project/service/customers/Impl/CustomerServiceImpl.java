package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.Customer;
import ac.za.cput.project.repository.customers.CustomerRepository;
import ac.za.cput.project.repository.customers.impl.CustomerRepositoryImpl;
import ac.za.cput.project.service.customers.CustomerService;

import java.util.Set;

public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl service = null;
    private CustomerRepository repository;

    private CustomerServiceImpl() {
        this.repository = CustomerRepositoryImpl.getRepository();
    }

    public static CustomerServiceImpl getService(){
        if (service == null) service = new CustomerServiceImpl();
        return service;
    }

    @Override
    public Set<Customer> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Customer create(Customer customer) {
        return this.repository.create(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.repository.update(customer);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Customer read(String s) {
        return this.repository.read(s);
    }
}
