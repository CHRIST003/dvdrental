package ac.za.cput.project.service.customers;

import ac.za.cput.project.domain.customers.Customer;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface CustomerService  extends IService<Customer, String> {

    Set<Customer> getAll();

}
