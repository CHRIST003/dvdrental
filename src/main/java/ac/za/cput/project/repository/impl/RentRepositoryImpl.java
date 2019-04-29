package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.Rent;
import ac.za.cput.project.repository.RentRepository;

import java.util.HashSet;
import java.util.Set;

public class RentRepositoryImpl implements RentRepository {


    private static RentRepositoryImpl repository = null;
    private Set<Rent> rents;

    private RentRepositoryImpl(){
        this.rents = new HashSet<>();
    }

    public static RentRepositoryImpl getRepository(){

        if(repository == null) repository = new RentRepositoryImpl();
        return repository;
    }

    @Override
    public Rent create(Rent rent) {
        this.rents.add(rent);
        return rent;
    }

    @Override
    public Rent update(Rent rent) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Rent read(String s) {
        return null;
    }

    @Override
    public Set<Rent> getAll() {
        return this.rents;
    }
}
