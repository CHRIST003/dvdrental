package ac.za.cput.project.service.sales.impl;

import ac.za.cput.project.domain.sales.SaleReport;
import ac.za.cput.project.repository.sales.SaleReportRepository;
import ac.za.cput.project.repository.sales.impl.SaleReportRepositoryImpl;
import ac.za.cput.project.service.sales.SaleReportService;

import java.util.Set;

public class SaleReportServiceImpl implements SaleReportService {

    private static SaleReportServiceImpl service = null;
    private SaleReportRepository repository;

    private SaleReportServiceImpl() {
        this.repository = SaleReportRepositoryImpl.getRepository();
    }

    public static SaleReportServiceImpl getService(){
        if (service == null) service = new SaleReportServiceImpl();
        return service;
    }

    @Override
    public Set<SaleReport> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SaleReport create(SaleReport saleReport) {
        return this.repository.create(saleReport);
    }

    @Override
    public SaleReport update(SaleReport saleReport) {
        return this.repository.update(saleReport);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public SaleReport read(String s) {
        return this.repository.read(s);
    }
}
