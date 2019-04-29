package ac.za.cput.project.repository;

import ac.za.cput.project.domain.CustomerContact;

import java.util.Set;

public interface CustomerContactRepository extends IRepository<CustomerContact, String> {

    Set<CustomerContact>getAll();
}
