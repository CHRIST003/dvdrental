package ac.za.cput.project.service.users;

import ac.za.cput.project.domain.users.Admin;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface AdminService extends IService<Admin, String> {

    Set<Admin> getAll();
}
