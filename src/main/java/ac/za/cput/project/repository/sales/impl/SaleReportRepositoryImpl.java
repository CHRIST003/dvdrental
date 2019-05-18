package ac.za.cput.project.repository.sales.impl;

import ac.za.cput.project.domain.sales.SaleReport;
import ac.za.cput.project.repository.sales.SaleReportRepository;

import java.util.HashSet;
import java.util.Set;

public class SaleReportRepositoryImpl implements SaleReportRepository {


    private static SaleReportRepositoryImpl repository = null;
    private Set<SaleReport> saleReports;

    private SaleReportRepositoryImpl(){
        this.saleReports = new HashSet<>();
    }

    private SaleReport findSaleReport(String SaleID) {
        return this.saleReports.stream()
                .filter(saleReport -> saleReport.getSaleID().trim().equals(SaleID))
                .findAny()
                .orElse(null);
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

        SaleReport toDelete = findSaleReport(saleReport.getSaleID());
        if(toDelete != null) {
            this.saleReports.remove(toDelete);
            return create(saleReport);
        }
        return null;
    }

    @Override
    public void delete(String SaleID) {

        SaleReport saleReport = findSaleReport(SaleID);
        if (saleReport != null) this.saleReports.remove(saleReport);

    }

    @Override
    public SaleReport read(final String SaleID) {
        SaleReport saleReport = findSaleReport(SaleID);
        return saleReport;
    }

    @Override
    public Set<SaleReport> getAll() {
        return this.saleReports;
    }
}
