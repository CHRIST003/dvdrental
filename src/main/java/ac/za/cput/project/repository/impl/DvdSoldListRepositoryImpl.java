package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.DvdSoldList;
import ac.za.cput.project.repository.DvdSoldListRepository;

import java.util.HashSet;
import java.util.Set;

public class DvdSoldListRepositoryImpl implements DvdSoldListRepository {



    private static DvdSoldListRepositoryImpl repository = null;
    private Set<DvdSoldList> dvdSoldLists;

    private DvdSoldListRepositoryImpl(){
        this.dvdSoldLists = new HashSet<>();
    }

    public static DvdSoldListRepositoryImpl getRepository(){

        if(repository == null) repository = new DvdSoldListRepositoryImpl();
        return repository;
    }


    @Override
    public DvdSoldList create(DvdSoldList dvdSoldList) {
        this.dvdSoldLists.add(dvdSoldList);
        return dvdSoldList;
    }

    @Override
    public DvdSoldList update(DvdSoldList dvdSoldList) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DvdSoldList read(String s) {
        return null;
    }

    @Override
    public Set<DvdSoldList> getAll() {
        return this.dvdSoldLists;
    }

}
