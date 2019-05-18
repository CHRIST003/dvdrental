package ac.za.cput.project.repository.rents.impl;

import ac.za.cput.project.domain.rents.RentReport;
import ac.za.cput.project.repository.rents.RentReportRepository;

import java.util.HashSet;
import java.util.Set;

public class RentReportRepositoryImpl implements RentReportRepository {

    private static RentReportRepositoryImpl repository = null;
    private Set<RentReport> rentReports;

    private RentReportRepositoryImpl(){
        this.rentReports = new HashSet<>();
    }

    private RentReport findRentReport (String rentID) {
        return this.rentReports.stream()
                .filter(rentReport -> rentReport.getRentID().trim().equals(rentID))
                .findAny()
                .orElse(null);
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
        RentReport toDelete = findRentReport(rentReport.getRentID());
        if(toDelete != null) {
            this.rentReports.remove(toDelete);
            return create(rentReport);
        }
        return null;
    }

    @Override
    public void delete(String rentID) {

        RentReport rentReport = findRentReport(rentID);
        if (rentReport != null) this.rentReports.remove(rentReport);

    }

    @Override
    public RentReport read(final String rentID) {
        RentReport rentReport = findRentReport(rentID);
        return rentReport;
    }

    @Override
    public Set<RentReport> getAll() {
        return this.rentReports;
    }
}
