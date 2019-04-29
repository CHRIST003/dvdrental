package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.Dvd;
import ac.za.cput.project.repository.DvdRepository;

import java.util.HashSet;
import java.util.Set;

public class DvdRepositoryImpl implements DvdRepository {

    private static DvdRepositoryImpl repository = null;
    private Set<Dvd> dvds;

    private DvdRepositoryImpl(){
        this.dvds = new HashSet<>();
    }

    public static DvdRepositoryImpl getRepository(){

        if(repository == null) repository = new DvdRepositoryImpl();
        return repository;
    }


    @Override
    public Dvd create(Dvd dvd) {
        this.dvds.add(dvd);
        return dvd;
    }

    @Override
    public Dvd update(Dvd dvd) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Dvd read(String s) {
        return null;
    }

    @Override
    public Set<Dvd> getAll() {
        return this.dvds;
    }
}
