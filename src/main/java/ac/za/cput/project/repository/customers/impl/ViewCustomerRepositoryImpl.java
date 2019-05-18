package ac.za.cput.project.repository.customers.impl;

import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.repository.customers.ViewCustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class ViewCustomerRepositoryImpl implements ViewCustomerRepository {


    private static ViewCustomerRepositoryImpl repository = null;
    private Set<ViewCustomer> viewCustomers;

    private ViewCustomerRepositoryImpl(){
        this.viewCustomers = new HashSet<>();
    }

    private ViewCustomer findViewCustomer(String CustID) {
        return this.viewCustomers.stream()
                .filter(viewCustomer -> viewCustomer.getCustID().trim().equals(CustID))
                .findAny()
                .orElse(null);
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

        ViewCustomer toDelete = findViewCustomer(viewCustomer.getCustID());
        if(toDelete != null) {
            this.viewCustomers.remove(toDelete);
            return create(viewCustomer);
        }

        return null;
    }

    @Override
    public void delete(String CustID) {

        ViewCustomer viewCustomer = findViewCustomer(CustID);
        if (viewCustomer != null) this.viewCustomers.remove(viewCustomer);

    }

    @Override
    public ViewCustomer read(final String CustID) {

        ViewCustomer viewCustomer = findViewCustomer(CustID);
        return viewCustomer;
    }

    @Override
    public Set<ViewCustomer> getAll() {
        return this.viewCustomers;
    }
}
