package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.repository.customers.ViewCustomerRepository;
import ac.za.cput.project.repository.customers.impl.ViewCustomerRepositoryImpl;
import ac.za.cput.project.service.customers.ViewCustomerService;

import java.util.Set;

public class ViewCustomerServiceImpl implements ViewCustomerService {

    private static ViewCustomerServiceImpl service = null;
    private ViewCustomerRepository repository;

    private ViewCustomerServiceImpl() {
        this.repository = ViewCustomerRepositoryImpl.getRepository();
    }

    public static ViewCustomerServiceImpl getService(){
        if (service == null) service = new ViewCustomerServiceImpl();
        return service;
    }

    @Override
    public Set<ViewCustomer> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ViewCustomer create(ViewCustomer viewCustomer) {
        return this.repository.create(viewCustomer);
    }

    @Override
    public ViewCustomer update(ViewCustomer viewCustomer) {
        return this.repository.update(viewCustomer);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public ViewCustomer read(String s) {
        return this.repository.read(s);
    }
}
