package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface CustomerAddressRepository extends IRepository<CustomerAddress, String> {

    Set<CustomerAddress>getAll();
}
