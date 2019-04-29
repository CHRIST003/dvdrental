package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.DvdStore;
import ac.za.cput.project.repository.DvdStoreRepository;

import java.util.HashSet;
import java.util.Set;

public class DvdStoreRepositoryImpl implements DvdStoreRepository {

    private static DvdStoreRepositoryImpl repository = null;
    private Set<DvdStore> dvdStores;

    private DvdStoreRepositoryImpl(){
        this.dvdStores = new HashSet<>();
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
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DvdStore read(String s) {
        return null;
    }

    @Override
    public Set<DvdStore> getAll() {
        return this.dvdStores;
    }
}
