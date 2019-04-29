package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Customer;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer, String>  {

    Set<Customer>getAll();
}
