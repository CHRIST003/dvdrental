package ac.za.cput.project.service.sales;

import ac.za.cput.project.domain.sales.Sale;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface SaleService extends IService<Sale, String> {

    Set<Sale> getAll();
}
