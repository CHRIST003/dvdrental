package ac.za.cput.project.service.sales.impl;

import ac.za.cput.project.domain.sales.Sale;
import ac.za.cput.project.repository.sales.SaleRepository;
import ac.za.cput.project.repository.sales.impl.SaleRepositoryImpl;
import ac.za.cput.project.service.sales.SaleService;

import java.util.Set;

public class SaleServiceImpl implements SaleService {

    private static SaleServiceImpl service = null;
    private SaleRepository repository;

    private SaleServiceImpl() {
        this.repository = SaleRepositoryImpl.getRepository();
    }

    public static SaleServiceImpl getService(){
        if (service == null) service = new SaleServiceImpl();
        return service;
    }

    @Override
    public Set<Sale> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Sale create(Sale sale) {
        return this.repository.create(sale);
    }

    @Override
    public Sale update(Sale sale) {
        return this.repository.update(sale);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Sale read(String s) {
        return this.repository.read(s);
    }
}
