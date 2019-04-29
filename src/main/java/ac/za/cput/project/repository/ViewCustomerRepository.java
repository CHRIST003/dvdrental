package ac.za.cput.project.repository;

import ac.za.cput.project.domain.ViewCustomer;

import java.util.Set;

public interface ViewCustomerRepository extends IRepository<ViewCustomer, String> {

    Set<ViewCustomer>getAll();
}
