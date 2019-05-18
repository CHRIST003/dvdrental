package ac.za.cput.project.repository.categories.impl;

import ac.za.cput.project.domain.categories.Comedy;
import ac.za.cput.project.repository.categories.ComedyRepository;

import java.util.HashSet;
import java.util.Set;

public class ComedyRepositoryImpl implements ComedyRepository {

    private static ComedyRepositoryImpl repository = null;
    private Set<Comedy> comedies;

    private ComedyRepositoryImpl(){
        this.comedies = new HashSet<>();
    }

    private Comedy findComdy(String CategoryID) {
        return this.comedies.stream()
                .filter(category -> category.getCategoryID().trim().equals(CategoryID))
                .findAny()
                .orElse(null);
    }

    public static ComedyRepositoryImpl getRepository(){
        if (repository == null) repository = new ComedyRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Comedy> getAll() {
        return this.comedies;
    }

    @Override
    public Comedy create(Comedy comedy) {
        this.comedies.add(comedy);
        return null;
    }

    @Override
    public Comedy update(Comedy comedy) {

        Comedy toDelete = findComdy(comedy.getCategoryID());
        if(toDelete != null) {
            this.comedies.remove(toDelete);
            return create(comedy);
        }
        return null;
    }

    @Override
    public void delete(String CategoryID) {

        Comedy comedy = findComdy(CategoryID);
        if (comedy != null) this.comedies.remove(comedy);
    }

    @Override
    public Comedy read(final String CategoryID) {
        Comedy comedy = findComdy(CategoryID);
        return comedy;
    }
}
