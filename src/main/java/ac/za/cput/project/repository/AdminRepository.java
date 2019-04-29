package ac.za.cput.project.repository;


import ac.za.cput.project.domain.Admin;

import java.util.Set;

public interface AdminRepository extends IRepository<Admin, String> {

    Set<Admin> getAll();
}
