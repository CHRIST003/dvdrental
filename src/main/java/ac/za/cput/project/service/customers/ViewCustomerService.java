package ac.za.cput.project.service.customers;

import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface ViewCustomerService extends IService<ViewCustomer, String> {

    Set<ViewCustomer> getAll();
}

