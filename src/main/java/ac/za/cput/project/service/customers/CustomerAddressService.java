package ac.za.cput.project.service.customers;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface CustomerAddressService  extends IService<CustomerAddress, String> {

    Set<CustomerAddress> getAll();
}

