package ac.za.cput.project.service.rents.impl;

import ac.za.cput.project.domain.rents.RentReport;
import ac.za.cput.project.repository.rents.RentReportRepository;
import ac.za.cput.project.repository.rents.impl.RentReportRepositoryImpl;
import ac.za.cput.project.service.rents.RentReportService;

import java.util.Set;

public class RentReportServiceImpl implements RentReportService {

    private static RentReportServiceImpl service = null;
    private RentReportRepository repository;

    private RentReportServiceImpl() {
        this.repository = RentReportRepositoryImpl.getRepository();
    }

    public static RentReportServiceImpl getService(){
        if (service == null) service = new RentReportServiceImpl();
        return service;
    }

    @Override
    public Set<RentReport> getAll() {
        return this.repository.getAll();
    }

    @Override
    public RentReport create(RentReport rentReport) {
        return this.repository.create(rentReport);
    }

    @Override
    public RentReport update(RentReport rentReport) {
        return this.repository.update(rentReport);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public RentReport read(String s) {
        return this.repository.read(s);
    }
}
