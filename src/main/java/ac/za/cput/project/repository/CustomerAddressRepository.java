package ac.za.cput.project.repository;

import ac.za.cput.project.domain.CustomerAddress;

import java.util.Set;

public interface CustomerAddressRepository extends IRepository<CustomerAddress, String> {

    Set<CustomerAddress>getAll();
}
