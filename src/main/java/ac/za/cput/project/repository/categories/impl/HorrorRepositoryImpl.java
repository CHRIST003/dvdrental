package ac.za.cput.project.repository.categories.impl;

import ac.za.cput.project.domain.categories.Horror;
import ac.za.cput.project.repository.categories.HorrorRepository;

import java.util.HashSet;
import java.util.Set;

public class HorrorRepositoryImpl implements HorrorRepository {

    private static HorrorRepositoryImpl repository = null;
    private Set<Horror> horrors;

    private HorrorRepositoryImpl(){
        this.horrors = new HashSet<>();
    }

    private Horror findHorror(String CategoryID) {
        return this.horrors.stream()
                .filter(category -> category.getCategoryID().trim().equals(CategoryID))
                .findAny()
                .orElse(null);
    }

    public static HorrorRepositoryImpl getRepository(){
        if (repository == null) repository = new HorrorRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Horror> getAll() {
        return this.horrors;
    }

    @Override
    public Horror create(Horror horror) {
        this.horrors.add(horror);
        return null;
    }

    @Override
    public Horror update(Horror horror) {

        Horror toDelete = findHorror(horror.getCategoryID());
        if(toDelete != null) {
            this.horrors.remove(toDelete);
            return create(horror);
        }
        return null;
    }

    @Override
    public void delete(String CategoryID) {

        Horror horror = findHorror(CategoryID);
        if (horror != null) this.horrors.remove(horror);
    }

    @Override
    public Horror read(final String CategoryID) {
        Horror horror = findHorror(CategoryID);
        return horror;
    }
}
