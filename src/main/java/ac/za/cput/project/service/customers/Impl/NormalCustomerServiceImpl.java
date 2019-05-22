package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.NormalCustomer;
import ac.za.cput.project.repository.customers.NormalCustomerRepository;
import ac.za.cput.project.repository.customers.impl.NormalCustomerRepositoryImpl;
import ac.za.cput.project.service.customers.NormalCustomerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class NormalCustomerServiceImpl implements NormalCustomerService {

    private static NormalCustomerServiceImpl service = null;
    private NormalCustomerRepository repository;

    private NormalCustomerServiceImpl() {
        this.repository = NormalCustomerRepositoryImpl.getRepository();
    }

    public static NormalCustomerServiceImpl getService(){
        if (service == null) service = new NormalCustomerServiceImpl();
        return service;
    }

    @Override
    public Set<NormalCustomer> getAll() {
        return this.repository.getAll();
    }

    @Override
    public NormalCustomer create(NormalCustomer normalCustomer) {
        return this.repository.create(normalCustomer);
    }

    @Override
    public NormalCustomer update(NormalCustomer normalCustomer) {
        return this.repository.update(normalCustomer);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public NormalCustomer read(String s) {
        return this.repository.read(s);
    }
}
