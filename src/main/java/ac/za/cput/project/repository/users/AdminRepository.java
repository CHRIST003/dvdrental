package ac.za.cput.project.repository.users;


import ac.za.cput.project.domain.users.Admin;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface AdminRepository extends IRepository<Admin, String> {

    Set<Admin> getAll();
}
