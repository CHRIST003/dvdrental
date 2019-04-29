package ac.za.cput.project.repository;

import ac.za.cput.project.domain.RentReport;

import java.util.Set;

public interface RentReportRepository  extends IRepository<RentReport, String> {

    Set<RentReport>getAll();
}
