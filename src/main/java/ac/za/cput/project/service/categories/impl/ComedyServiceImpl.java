package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Comedy;
import ac.za.cput.project.repository.categories.ComedyRepository;
import ac.za.cput.project.repository.categories.impl.ComedyRepositoryImpl;
import ac.za.cput.project.service.categories.ComedyService;

import java.util.Set;

public class ComedyServiceImpl implements ComedyService {

    private static ComedyServiceImpl service = null;
    private ComedyRepository repository;

    private ComedyServiceImpl() {
        this.repository = ComedyRepositoryImpl.getRepository();
    }

    public static ComedyServiceImpl getService(){
        if (service == null) service = new ComedyServiceImpl();
        return service;
    }

    @Override
    public Set<Comedy> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Comedy create(Comedy comedy) {
        return this.repository.create(comedy);
    }

    @Override
    public Comedy update(Comedy comedy) {
        return this.repository.update(comedy);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Comedy read(String s) {
        return this.repository.read(s);
    }
}
