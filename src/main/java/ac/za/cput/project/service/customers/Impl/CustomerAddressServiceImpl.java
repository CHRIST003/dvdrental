package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.repository.customers.CustomerAddressRepository;
import ac.za.cput.project.repository.customers.impl.CustomerAddressRepositoryImpl;
import ac.za.cput.project.service.customers.CustomerAddressService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {

    private static CustomerAddressServiceImpl service = null;
    private CustomerAddressRepository repository;

    private CustomerAddressServiceImpl() {
        this.repository = CustomerAddressRepositoryImpl.getRepository();
    }

    public static CustomerAddressServiceImpl getService(){
        if (service == null) service = new CustomerAddressServiceImpl();
        return service;
    }

    @Override
    public Set<CustomerAddress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public CustomerAddress create(CustomerAddress customerAddress) {
        return this.repository.create(customerAddress);
    }

    @Override
    public CustomerAddress update(CustomerAddress customerAddress) {
        return this.repository.update(customerAddress);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public CustomerAddress read(String s) {
        return this.repository.read(s);
    }
}
