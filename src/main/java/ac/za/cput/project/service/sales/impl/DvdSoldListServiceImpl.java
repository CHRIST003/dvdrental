package ac.za.cput.project.service.sales.impl;

import ac.za.cput.project.domain.sales.DvdSoldList;
import ac.za.cput.project.repository.sales.DvdSoldListRepository;
import ac.za.cput.project.repository.sales.impl.DvdSoldListRepositoryImpl;
import ac.za.cput.project.service.sales.DvdSoldListService;

import java.util.Set;

public class DvdSoldListServiceImpl implements DvdSoldListService {

    private static DvdSoldListServiceImpl service = null;
    private DvdSoldListRepository repository;

    private DvdSoldListServiceImpl() {
        this.repository = DvdSoldListRepositoryImpl.getRepository();
    }

    public static DvdSoldListServiceImpl getService(){
        if (service == null) service = new DvdSoldListServiceImpl();
        return service;
    }

    @Override
    public Set<DvdSoldList> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DvdSoldList create(DvdSoldList dvdSoldList) {
        return this.repository.create(dvdSoldList);
    }

    @Override
    public DvdSoldList update(DvdSoldList dvdSoldList) {
        return this.repository.update(dvdSoldList);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public DvdSoldList read(String s) {
        return this.repository.read(s);
    }
}
