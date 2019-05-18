package ac.za.cput.project.service.customers;

import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface CustomerContactService extends IService<CustomerContact, String> {

    Set<CustomerContact> getAll();
}

