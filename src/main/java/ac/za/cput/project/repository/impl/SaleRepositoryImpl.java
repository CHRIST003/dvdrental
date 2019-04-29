package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.Sale;
import ac.za.cput.project.repository.SaleRepository;

import java.util.HashSet;
import java.util.Set;

public class SaleRepositoryImpl implements SaleRepository {


    private static SaleRepositoryImpl repository = null;
    private Set<Sale> sales;

    private SaleRepositoryImpl(){
        this.sales = new HashSet<>();
    }

    public static SaleRepositoryImpl getRepository(){

        if(repository == null) repository = new SaleRepositoryImpl();
        return repository;
    }

    @Override
    public Sale create(Sale sale) {
        this.sales.add(sale);
        return sale;
    }

    @Override
    public Sale update(Sale sale) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Sale read(String s) {
        return null;
    }

    @Override
    public Set<Sale> getAll() {
        return null;
    }
}
