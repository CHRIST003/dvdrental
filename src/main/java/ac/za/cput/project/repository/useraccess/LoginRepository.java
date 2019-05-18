package ac.za.cput.project.repository.useraccess;

import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface LoginRepository extends IRepository<Login, String> {

    Set<Login> getAll();
}
