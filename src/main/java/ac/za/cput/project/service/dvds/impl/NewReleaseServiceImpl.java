package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.repository.dvds.NewReleaseRepository;
import ac.za.cput.project.repository.dvds.impl.NewReleaseRepositoryImpl;
import ac.za.cput.project.service.dvds.NewReleaseService;

import java.util.Set;

public class NewReleaseServiceImpl implements NewReleaseService {

    private static NewReleaseServiceImpl service = null;
    private NewReleaseRepository repository;

    private NewReleaseServiceImpl() {
        this.repository = NewReleaseRepositoryImpl.getRepository();
    }

    public static NewReleaseServiceImpl getService(){
        if (service == null) service = new NewReleaseServiceImpl();
        return service;
    }

    @Override
    public Set<NewRelease> getAll() {
        return this.repository.getAll();
    }

    @Override
    public NewRelease create(NewRelease newRelease) {
        return this.repository.create(newRelease);
    }

    @Override
    public NewRelease update(NewRelease newRelease) {
        return this.repository.update(newRelease);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public NewRelease read(String s) {
        return this.repository.read(s);
    }
}
