package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.ViewCustomer;
import ac.za.cput.project.repository.ViewCustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class ViewCustomerRepositoryImpl implements ViewCustomerRepository {


    private static ViewCustomerRepositoryImpl repository = null;
    private Set<ViewCustomer> viewCustomers;

    private ViewCustomerRepositoryImpl(){
        this.viewCustomers = new HashSet<>();
    }

    public static ViewCustomerRepositoryImpl getRepository(){

        if(repository == null) repository = new ViewCustomerRepositoryImpl();
        return repository;
    }

    @Override
    public ViewCustomer create(ViewCustomer viewCustomer) {
        this.viewCustomers.add(viewCustomer);
        return viewCustomer;
    }

    @Override
    public ViewCustomer update(ViewCustomer viewCustomer) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public ViewCustomer read(String s) {
        return null;
    }

    @Override
    public Set<ViewCustomer> getAll() {
        return this.viewCustomers;
    }
}
