package ac.za.cput.project.service.rents;

import ac.za.cput.project.domain.rents.RentReport;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface RentReportService  extends IService<RentReport, String> {

    Set<RentReport> getAll();
}
