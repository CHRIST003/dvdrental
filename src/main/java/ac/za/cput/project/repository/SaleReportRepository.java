package ac.za.cput.project.repository;

import ac.za.cput.project.domain.SaleReport;

import java.util.Set;

public interface SaleReportRepository extends IRepository<SaleReport, String> {

    Set<SaleReport>getAll();
}
