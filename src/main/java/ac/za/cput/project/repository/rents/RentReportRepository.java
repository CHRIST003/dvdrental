package ac.za.cput.project.repository.rents;

import ac.za.cput.project.domain.rents.RentReport;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface RentReportRepository  extends IRepository<RentReport, String> {

    Set<RentReport>getAll();
}
