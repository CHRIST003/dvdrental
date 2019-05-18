package ac.za.cput.project.repository.dvds.impl;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.repository.dvds.NewReleaseRepository;

import java.util.HashSet;
import java.util.Set;

public class NewReleaseRepositoryImpl implements NewReleaseRepository {

    private static NewReleaseRepositoryImpl repository = null;
    private Set<NewRelease> newReleases;

    private NewReleaseRepositoryImpl(){
        this.newReleases = new HashSet<>();
    }

    private NewRelease findNewRelease(String DvdID) {
        return this.newReleases.stream()
                .filter(dvd -> dvd.getDvdID().trim().equals(DvdID))
                .findAny()
                .orElse(null);
    }

    public static NewReleaseRepositoryImpl getRepository(){

        if(repository == null) repository = new NewReleaseRepositoryImpl();
        return repository;
    }


    @Override
    public NewRelease create(NewRelease newRelease) {
        this.newReleases.add(newRelease);
        return newRelease;
    }

    @Override
    public NewRelease update(NewRelease newRelease) {

        NewRelease toDelete = findNewRelease(newRelease.getDvdID());
        if(toDelete != null) {
            this.newReleases.remove(toDelete);
            return create(newRelease);
        }
        return null;
    }

    @Override
    public void delete(String DvdID) {

        NewRelease newRelease = findNewRelease(DvdID);
        if (newRelease != null) this.newReleases.remove(newRelease);

    }

    @Override
    public NewRelease read(final String DvdID) {
        NewRelease newRelease = findNewRelease(DvdID);
        return newRelease;
    }

    @Override
    public Set<NewRelease> getAll() {
        return this.newReleases;
    }
}
