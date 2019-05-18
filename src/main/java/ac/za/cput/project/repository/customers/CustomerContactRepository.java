package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface CustomerContactRepository extends IRepository<CustomerContact, String> {

    Set<CustomerContact>getAll();
}
