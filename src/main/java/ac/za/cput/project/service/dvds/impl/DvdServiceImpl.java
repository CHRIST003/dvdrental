package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.Dvd;
import ac.za.cput.project.repository.dvds.DvdRepository;
import ac.za.cput.project.repository.dvds.impl.DvdRepositoryImpl;
import ac.za.cput.project.service.dvds.DvdService;

import java.util.Set;

public class DvdServiceImpl implements DvdService {

    private static DvdServiceImpl service = null;
    private DvdRepository repository;

    private DvdServiceImpl() {
        this.repository = DvdRepositoryImpl.getRepository();
    }

    public static DvdServiceImpl getService(){
        if (service == null) service = new DvdServiceImpl();
        return service;
    }

    @Override
    public Set<Dvd> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Dvd create(Dvd dvd) {
        return this.repository.create(dvd);
    }

    @Override
    public Dvd update(Dvd dvd) {
        return this.repository.update(dvd);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Dvd read(String s) {
        return this.repository.read(s);
    }
}
