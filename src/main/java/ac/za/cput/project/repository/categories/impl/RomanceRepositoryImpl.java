package ac.za.cput.project.repository.categories.impl;

import ac.za.cput.project.domain.categories.Romance;
import ac.za.cput.project.repository.categories.RomanceRepository;

import java.util.HashSet;
import java.util.Set;

public class RomanceRepositoryImpl implements RomanceRepository {

    private static RomanceRepositoryImpl repository = null;
    private Set<Romance> romances;

    private RomanceRepositoryImpl(){
        this.romances = new HashSet<>();
    }

    private Romance findRomance(String CategoryID) {
        return this.romances.stream()
                .filter(category -> category.getCategoryID().trim().equals(CategoryID))
                .findAny()
                .orElse(null);
    }

    public static RomanceRepositoryImpl getRepository(){
        if (repository == null) repository = new RomanceRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Romance> getAll() {
        return this.romances;
    }

    @Override
    public Romance create(Romance romance) {
        this.romances.add(romance);
        return null;
    }

    @Override
    public Romance update(Romance romance) {

        Romance toDelete = findRomance(romance.getCategoryID());
        if(toDelete != null) {
            this.romances.remove(toDelete);
            return create(romance);
        }
        return null;
    }

    @Override
    public void delete(String CategoryID) {

        Romance romance = findRomance(CategoryID);
        if (romance != null) this.romances.remove(romance);
    }

    @Override
    public Romance read(final String CategoryID) {
        Romance romance = findRomance(CategoryID);
        return romance;
    }
}
