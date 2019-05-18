package ac.za.cput.project.repository.rents.impl;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.repository.rents.RentRepository;

import java.util.HashSet;
import java.util.Set;

public class RentRepositoryImpl implements RentRepository {


    private static RentRepositoryImpl repository = null;
    private Set<Rent> rents;

    private RentRepositoryImpl(){
        this.rents = new HashSet<>();
    }

    private Rent findRent(String rentId) {
        return this.rents.stream()
                .filter(rent -> rent.getRentId().trim().equals(rentId))
                .findAny()
                .orElse(null);
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
        Rent toDelete = findRent(rent.getRentId());
        if(toDelete != null) {
            this.rents.remove(toDelete);
            return create(rent);
        }
        return null;
    }

    @Override
    public void delete(String rentId) {

        Rent rent = findRent(rentId);
        if (rent != null) this.rents.remove(rent);

    }

    @Override
    public Rent read(final String rentId) {
        Rent rent = findRent(rentId);
        return rent;

    }

    @Override
    public Set<Rent> getAll() {
        return this.rents;
    }
}
