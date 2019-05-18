package ac.za.cput.project.repository.sales.impl;

import ac.za.cput.project.domain.dvds.Dvd;
import ac.za.cput.project.domain.sales.DvdSoldList;
import ac.za.cput.project.repository.sales.DvdSoldListRepository;

import java.util.HashSet;
import java.util.Set;

public class DvdSoldListRepositoryImpl implements DvdSoldListRepository {



    private static DvdSoldListRepositoryImpl repository = null;
    private Set<DvdSoldList> dvdSoldLists;

    private DvdSoldListRepositoryImpl(){
        this.dvdSoldLists = new HashSet<>();
    }

    private DvdSoldList findDvdSoldList(String DvdSaleListID) {
        return this.dvdSoldLists.stream()
                .filter(dvdSoldList -> dvdSoldList.getDvdSaleListID().trim().equals(DvdSaleListID))
                .findAny()
                .orElse(null);
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

        DvdSoldList toDelete = findDvdSoldList(dvdSoldList.getDvdSaleListID());
        if(toDelete != null) {
            this.dvdSoldLists.remove(toDelete);
            return create(dvdSoldList);
        }
        return null;

    }

    @Override
    public void delete(String DvdSaleListID) {

        DvdSoldList dvdSoldList = findDvdSoldList(DvdSaleListID);
        if (dvdSoldList != null) this.dvdSoldLists.remove(dvdSoldList);

    }

    @Override
    public DvdSoldList read(final String DvdSaleListID) {
        DvdSoldList dvdSoldList = findDvdSoldList(DvdSaleListID);
        return dvdSoldList;
    }

    @Override
    public Set<DvdSoldList> getAll() {
        return this.dvdSoldLists;
    }

}
