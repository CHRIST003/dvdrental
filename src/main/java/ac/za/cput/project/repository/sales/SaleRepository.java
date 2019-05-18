package ac.za.cput.project.repository.sales;

import ac.za.cput.project.domain.sales.Sale;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface SaleRepository extends IRepository<Sale, String> {

    Set<Sale>getAll();
}
