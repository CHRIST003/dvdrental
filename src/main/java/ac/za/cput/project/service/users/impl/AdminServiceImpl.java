package ac.za.cput.project.service.users.impl;

import ac.za.cput.project.domain.users.Admin;
import ac.za.cput.project.repository.users.AdminRepository;
import ac.za.cput.project.repository.users.impl.AdminRepositoryImpl;
import ac.za.cput.project.service.users.AdminService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class AdminServiceImpl implements AdminService {

    private static AdminServiceImpl service = null;
    private AdminRepository repository;

    private AdminServiceImpl() {
        this.repository = AdminRepositoryImpl.getRepository();
    }

    public static AdminServiceImpl getService(){
        if (service == null) service = new AdminServiceImpl();
        return service;
    }

    @Override
    public Set<Admin> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Admin create(Admin admin) {
        return this.repository.create(admin);
    }

    @Override
    public Admin update(Admin admin) {
        return this.repository.update(admin);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Admin read(String s) {
        return this.repository.read(s);
    }
}
