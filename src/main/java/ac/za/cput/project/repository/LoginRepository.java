package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Login;

import java.util.Set;

public interface LoginRepository extends IRepository<Login, String> {

    Set<Login> getAll();
}
