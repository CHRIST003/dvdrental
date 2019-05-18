package ac.za.cput.project.repository.sales.impl;

import ac.za.cput.project.domain.sales.Sale;
import ac.za.cput.project.repository.sales.SaleRepository;

import java.util.HashSet;
import java.util.Set;

public class SaleRepositoryImpl implements SaleRepository {


    private static SaleRepositoryImpl repository = null;
    private Set<Sale> sales;

    private SaleRepositoryImpl(){
        this.sales = new HashSet<>();
    }

    private Sale findSale(String saleID) {
        return this.sales.stream()
                .filter(sale -> sale.getSaleID().trim().equals(saleID))
                .findAny()
                .orElse(null);
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

        Sale toDelete = findSale(sale.getSaleID());
        if(toDelete != null) {
            this.sales.remove(toDelete);
            return create(sale);
        }
        return null;
    }

    @Override
    public void delete(String saleID) {

        Sale sale = findSale(saleID);
        if (sale != null) this.sales.remove(sale);

    }

    @Override
    public Sale read(final String saleID) {
        Sale sale = findSale(saleID);
        return sale;
    }

    @Override
    public Set<Sale> getAll() {
        return null;
    }
}
