package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Sale;

import java.util.Set;

public interface SaleRepository extends IRepository<Sale, String> {

    Set<Sale>getAll();
}
