package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface ViewCustomerRepository extends IRepository<ViewCustomer, String> {

    Set<ViewCustomer>getAll();
}
