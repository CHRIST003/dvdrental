package ac.za.cput.project.repository.users.impl;


import ac.za.cput.project.domain.users.Admin;
import ac.za.cput.project.repository.users.AdminRepository;

import java.util.HashSet;
import java.util.Set;

public class AdminRepositoryImpl implements AdminRepository {


    private static AdminRepositoryImpl repository = null;
    private Set<Admin> admins;

    private AdminRepositoryImpl(){
        this.admins = new HashSet<>();
    }

    private Admin findAdmin(String AdID) {
        return this.admins.stream()
                .filter(admin -> admin.getAdID().trim().equals(AdID))
                .findAny()
                .orElse(null);
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

        Admin toDelete = findAdmin(admin.getAdID());
        if(toDelete != null) {
            this.admins.remove(toDelete);
            return create(admin);
        }
        return null;
    }

    @Override
    public void delete(String AdID) {

        Admin admin = findAdmin(AdID);
        if (admin != null) this.admins.remove(admin);

    }

    @Override
    public Admin read(final String AdID) {

        Admin admin = findAdmin(AdID);
        return admin;
    }

    @Override
    public Set<Admin> getAll() {
        return this.admins;
    }
}
