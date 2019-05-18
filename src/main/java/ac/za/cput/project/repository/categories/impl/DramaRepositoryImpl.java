package ac.za.cput.project.repository.categories.impl;

import ac.za.cput.project.domain.categories.Drama;
import ac.za.cput.project.repository.categories.DramaRepository;

import java.util.HashSet;
import java.util.Set;

public class DramaRepositoryImpl implements DramaRepository {

    private static DramaRepositoryImpl repository = null;
    private Set<Drama> dramas;

    private DramaRepositoryImpl(){
        this.dramas = new HashSet<>();
    }

    private Drama findDrama(String CategoryID) {
        return this.dramas.stream()
                .filter(category -> category.getCategoryID().trim().equals(CategoryID))
                .findAny()
                .orElse(null);
    }

    public static DramaRepositoryImpl getRepository(){
        if (repository == null) repository = new DramaRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Drama> getAll() {
        return this.dramas;
    }

    @Override
    public Drama create(Drama drama) {
        this.dramas.add(drama);
        return null;
    }

    @Override
    public Drama update(Drama drama) {

        Drama toDelete = findDrama(drama.getCategoryID());
        if(toDelete != null) {
            this.dramas.remove(toDelete);
            return create(drama);
        }
        return null;
    }

    @Override
    public void delete(String CategoryID) {

        Drama drama = findDrama(CategoryID);
        if (drama != null) this.dramas.remove(drama);
    }

    @Override
    public Drama read(final String CategoryID) {
        Drama drama = findDrama(CategoryID);
        return drama;
    }
}
