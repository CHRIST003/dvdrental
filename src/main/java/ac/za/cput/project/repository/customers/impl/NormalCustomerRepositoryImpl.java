package ac.za.cput.project.repository.customers.impl;

import ac.za.cput.project.domain.customers.NormalCustomer;
import ac.za.cput.project.repository.customers.NormalCustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class NormalCustomerRepositoryImpl implements NormalCustomerRepository {

    private static NormalCustomerRepositoryImpl repository = null;
    private Set<NormalCustomer> normalCustomers;

    private NormalCustomerRepositoryImpl(){
        this.normalCustomers = new HashSet<>();
    }

    private NormalCustomer findNormalCustomer(String CustID) {
        return this.normalCustomers.stream()
                .filter(customer -> customer.getCustID().trim().equals(CustID))
                .findAny()
                .orElse(null);
    }

    public static NormalCustomerRepositoryImpl getRepository(){

        if(repository == null) repository = new NormalCustomerRepositoryImpl();
        return repository;
    }


    @Override
    public NormalCustomer create(NormalCustomer normalCustomer) {
        this.normalCustomers.add(normalCustomer);
        return normalCustomer;
    }

    @Override
    public NormalCustomer update(NormalCustomer normalCustomer) {

        NormalCustomer toDelete = findNormalCustomer(normalCustomer.getCustID());
        if(toDelete != null) {
            this.normalCustomers.remove(toDelete);
            return create(normalCustomer);
        }
        return null;
    }

    @Override
    public void delete(String CustID) {

        NormalCustomer normalCustomer = findNormalCustomer(CustID);
        if (normalCustomer != null) this.normalCustomers.remove(normalCustomer);

    }

    @Override
    public NormalCustomer read(final String CustID) {

        NormalCustomer normalCustomer = findNormalCustomer(CustID);
        return normalCustomer;
    }

    @Override
    public Set<NormalCustomer> getAll() {
        return this.normalCustomers;
    }
}
