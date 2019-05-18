package ac.za.cput.project.service.useraccess;

import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface LoginService extends IService <Login, String> {

        Set<Login> getAll();
}
