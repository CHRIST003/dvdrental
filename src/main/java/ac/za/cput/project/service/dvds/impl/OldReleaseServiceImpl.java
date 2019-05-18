package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.OldRelease;
import ac.za.cput.project.repository.dvds.OldReleaseRepository;
import ac.za.cput.project.repository.dvds.impl.OldReleaseRepositoryImpl;
import ac.za.cput.project.service.dvds.OldReleaseService;

import java.util.Set;

public class OldReleaseServiceImpl implements OldReleaseService {

    private static OldReleaseServiceImpl service = null;
    private OldReleaseRepository repository;

    private OldReleaseServiceImpl() {
        this.repository = OldReleaseRepositoryImpl.getRepository();
    }

    public static OldReleaseServiceImpl getService(){
        if (service == null) service = new OldReleaseServiceImpl();
        return service;
    }

    @Override
    public Set<OldRelease> getAll() {
        return this.repository.getAll();
    }

    @Override
    public OldRelease create(OldRelease oldRelease) {
        return this.repository.create(oldRelease);
    }

    @Override
    public OldRelease update(OldRelease oldRelease) {
        return this.repository.update(oldRelease);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public OldRelease read(String s) {
        return this.repository.read(s);
    }
}
