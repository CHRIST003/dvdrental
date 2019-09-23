package ac.za.cput.project.repository.dvds.impl;

import ac.za.cput.project.domain.dvds.Dvd;
import ac.za.cput.project.repository.dvds.DvdRepository;

import java.util.HashSet;
import java.util.Set;

public class DvdRepositoryImpl implements DvdRepository {

    private static DvdRepositoryImpl repository = null;
    private Set<Dvd> dvds;

    private DvdRepositoryImpl(){
        this.dvds = new HashSet<>();
    }

    private Dvd findDvd(String DvdID) {
        return this.dvds.stream()
                .filter(dvd -> dvd.getDvdID().trim().equals(DvdID))
                .findAny()
                .orElse(null);
    }

        public static DvdRepositoryImpl getRepository(){

            if(repository == null) repository = new DvdRepositoryImpl();
            return repository;
        }


    @Override
    public Dvd create(Dvd dvd) {
        this.dvds.add(dvd);
        return dvd;
    }

    @Override
    public Dvd update(Dvd dvd) {

        Dvd toDelete = findDvd(dvd.getDvdID());
        if(toDelete != null) {
            this.dvds.remove(toDelete);
            return create(dvd);
        }
        return null;
    }

    @Override
    public void delete(String DvdID) {

        Dvd dvd = findDvd(DvdID);
        if (dvd != null) this.dvds.remove(dvd);

    }

    @Override
    public Dvd read(final String DvdID) {
        Dvd dvd = findDvd(DvdID);
        return dvd;
    }

    @Override
    public Set<Dvd> getAll() {
        return this.dvds;
    }
}
