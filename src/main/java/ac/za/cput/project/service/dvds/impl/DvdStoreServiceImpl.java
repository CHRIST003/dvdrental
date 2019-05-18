package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.repository.dvds.DvdStoreRepository;
import ac.za.cput.project.repository.dvds.impl.DvdStoreRepositoryImpl;
import ac.za.cput.project.service.dvds.DvdStoreService;

import java.util.Set;

public class DvdStoreServiceImpl implements DvdStoreService {

    private static DvdStoreServiceImpl service = null;
    private DvdStoreRepository repository;

    private DvdStoreServiceImpl() {
        this.repository = DvdStoreRepositoryImpl.getRepository();
    }

    public static DvdStoreServiceImpl getService(){
        if (service == null) service = new DvdStoreServiceImpl();
        return service;
    }

    @Override
    public Set<DvdStore> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DvdStore create(DvdStore dvdStore) {
        return this.repository.create(dvdStore);
    }

    @Override
    public DvdStore update(DvdStore dvdStore) {
        return this.repository.update(dvdStore);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public DvdStore read(String s) {
        return this.repository.read(s);
    }
}
