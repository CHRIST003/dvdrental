package ac.za.cput.project.service.sales;

import ac.za.cput.project.domain.sales.SaleReport;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface SaleReportService extends IService<SaleReport, String> {

    Set<SaleReport> getAll();
}
