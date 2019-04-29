package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.Admin;
import ac.za.cput.project.repository.AdminRepository;

import java.util.HashSet;
import java.util.Set;

public class AdminRepositoryImpl implements AdminRepository {


    private static AdminRepositoryImpl repository = null;
    private Set<Admin> admins;

    private AdminRepositoryImpl(){
        this.admins = new HashSet<>();
    }

    public static AdminRepositoryImpl getRepository(){

        if(repository == null) repository = new AdminRepositoryImpl();
        return repository;
    }

    @Override
    public Admin create(Admin admin) {
        this.admins.add(admin);
        return admin;
    }

    @Override
    public Admin update(Admin admin) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Admin read(String s) {
        return null;
    }

    @Override
    public Set<Admin> getAll() {
        return this.admins;
    }
}
