package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.NormalCustomer;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface NormalCustomerRepository extends IRepository<NormalCustomer, String> {

    Set<NormalCustomer> getAll();
}
