package ac.za.cput.project.repository.sales;

import ac.za.cput.project.domain.sales.SaleReport;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface SaleReportRepository extends IRepository<SaleReport, String> {

    Set<SaleReport>getAll();
}
