package ac.za.cput.project.service.customers;

import ac.za.cput.project.domain.customers.NormalCustomer;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface NormalCustomerService extends IService<NormalCustomer, String> {

    Set<NormalCustomer> getAll();
}
