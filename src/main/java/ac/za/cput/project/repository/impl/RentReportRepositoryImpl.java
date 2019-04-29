package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.RentReport;
import ac.za.cput.project.repository.RentReportRepository;

import java.util.HashSet;
import java.util.Set;

public class RentReportRepositoryImpl implements RentReportRepository {

    private static RentReportRepositoryImpl repository = null;
    private Set<RentReport> rentReports;

    private RentReportRepositoryImpl(){
        this.rentReports = new HashSet<>();
    }

    public static RentReportRepositoryImpl getRepository(){

        if(repository == null) repository = new RentReportRepositoryImpl();
        return repository;
    }


    @Override
    public RentReport create(RentReport rentReport) {
        this.rentReports.add(rentReport);
        return rentReport;
    }

    @Override
    public RentReport update(RentReport rentReport) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public RentReport read(String s) {
        return null;
    }

    @Override
    public Set<RentReport> getAll() {
        return this.rentReports;
    }
}
