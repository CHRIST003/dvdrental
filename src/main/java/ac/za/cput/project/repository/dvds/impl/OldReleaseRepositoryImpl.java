package ac.za.cput.project.repository.dvds.impl;

import ac.za.cput.project.domain.dvds.OldRelease;
import ac.za.cput.project.repository.dvds.OldReleaseRepository;

import java.util.HashSet;
import java.util.Set;

public class OldReleaseRepositoryImpl implements OldReleaseRepository {

    private static OldReleaseRepositoryImpl repository = null;
    private Set<OldRelease> oldReleases;

    private OldReleaseRepositoryImpl(){
        this.oldReleases = new HashSet<>();
    }

    private OldRelease findOlRelease(String DvdID) {
        return this.oldReleases.stream()
                .filter(dvd -> dvd.getDvdID().trim().equals(DvdID))
                .findAny()
                .orElse(null);
    }

    public static OldReleaseRepositoryImpl getRepository(){

        if(repository == null) repository = new OldReleaseRepositoryImpl();
        return repository;
    }


    @Override
    public OldRelease create(OldRelease oldRelease) {
        this.oldReleases.add(oldRelease);
        return oldRelease;
    }

    @Override
    public OldRelease update(OldRelease oldRelease) {

        OldRelease toDelete = findOlRelease(oldRelease.getDvdID());
        if(toDelete != null) {
            this.oldReleases.remove(toDelete);
            return create(oldRelease);
        }
        return null;
    }

    @Override
    public void delete(String DvdID) {

        OldRelease oldRelease = findOlRelease(DvdID);
        if (oldRelease != null) this.oldReleases.remove(oldRelease);

    }

    @Override
    public OldRelease read(final String DvdID) {
        OldRelease oldRelease = findOlRelease(DvdID);
        return oldRelease;
    }

    @Override
    public Set<OldRelease> getAll() {
        return this.oldReleases;
    }
}
