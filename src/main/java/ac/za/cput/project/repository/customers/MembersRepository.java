package ac.za.cput.project.repository.customers;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface MembersRepository extends IRepository<Members, String> {

    Set<Members> getAll();
}
