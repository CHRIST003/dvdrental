package ac.za.cput.project.service.customers;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface MembersService extends IService<Members, String> {

    Set<Members> getAll();
}

