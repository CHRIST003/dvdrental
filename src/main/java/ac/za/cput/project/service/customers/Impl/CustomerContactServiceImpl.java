package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.repository.customers.CustomerContactRepository;
import ac.za.cput.project.repository.customers.impl.CustomerContactRepositoryImpl;
import ac.za.cput.project.service.customers.CustomerContactService;

import java.util.Set;

public class CustomerContactServiceImpl implements CustomerContactService {

    private static CustomerContactServiceImpl service = null;
    private CustomerContactRepository repository;

    private CustomerContactServiceImpl() {
        this.repository = CustomerContactRepositoryImpl.getRepository();
    }

    public static CustomerContactServiceImpl getService(){
        if (service == null) service = new CustomerContactServiceImpl();
        return service;
    }

    @Override
    public Set<CustomerContact> getAll() {
        return this.repository.getAll();
    }

    @Override
    public CustomerContact create(CustomerContact customerContact) {
        return this.repository.create(customerContact);
    }

    @Override
    public CustomerContact update(CustomerContact customerContact) {
        return this.repository.update(customerContact);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public CustomerContact read(String s) {
        return this.repository.read(s);
    }
}
