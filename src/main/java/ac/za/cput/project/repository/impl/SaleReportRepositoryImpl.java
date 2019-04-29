package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.SaleReport;
import ac.za.cput.project.repository.SaleReportRepository;

import java.util.HashSet;
import java.util.Set;

public class SaleReportRepositoryImpl implements SaleReportRepository {


    private static SaleReportRepositoryImpl repository = null;
    private Set<SaleReport> saleReports;

    private SaleReportRepositoryImpl(){
        this.saleReports = new HashSet<>();
    }

    public static SaleReportRepositoryImpl getRepository(){

        if(repository == null) repository = new SaleReportRepositoryImpl();
        return repository;
    }



    @Override
    public SaleReport create(SaleReport saleReport) {
        this.saleReports.add(saleReport);
        return saleReport;
    }

    @Override
    public SaleReport update(SaleReport saleReport) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public SaleReport read(String s) {
        return null;
    }

    @Override
    public Set<SaleReport> getAll() {
        return this.saleReports;
    }
}
