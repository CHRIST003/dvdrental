package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.Customer;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer, String> {

    Set<Customer>getAll();
}
