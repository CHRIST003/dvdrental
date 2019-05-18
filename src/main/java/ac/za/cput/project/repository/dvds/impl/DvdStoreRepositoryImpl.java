package ac.za.cput.project.repository.dvds.impl;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.repository.dvds.DvdStoreRepository;

import java.util.HashSet;
import java.util.Set;

public class DvdStoreRepositoryImpl implements DvdStoreRepository {

    private static DvdStoreRepositoryImpl repository = null;
    private Set<DvdStore> dvdStores;

    private DvdStoreRepositoryImpl(){
        this.dvdStores = new HashSet<>();
    }

    private DvdStore findDvdStore(String name) {
        return this.dvdStores.stream()
                .filter(dvdStore -> dvdStore.getName().trim().equals(name))
                .findAny()
                .orElse(null);
    }

    public static DvdStoreRepositoryImpl getRepository(){

        if(repository == null) repository = new DvdStoreRepositoryImpl();
        return repository;
    }


    @Override
    public DvdStore create(DvdStore dvdStore) {
       this.dvdStores.add(dvdStore);
       return dvdStore;
    }

    @Override
    public DvdStore update(DvdStore dvdStore) {

        DvdStore toDelete = findDvdStore(dvdStore.getName());
        if(toDelete != null) {
            this.dvdStores.remove(toDelete);
            return create(dvdStore);
        }
        return null;
    }

    @Override
    public void delete(String name) {

        DvdStore dvdStore = findDvdStore(name);
        if (dvdStore != null) this.dvdStores.remove(dvdStore);
    }

    @Override
    public DvdStore read( final String name) {
        DvdStore dvdStore = findDvdStore(name);
        return dvdStore;

    }

    @Override
    public Set<DvdStore> getAll() {
        return this.dvdStores;
    }
}
