package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Romance;
import ac.za.cput.project.repository.categories.RomanceRepository;
import ac.za.cput.project.repository.categories.impl.RomanceRepositoryImpl;
import ac.za.cput.project.service.categories.RomanceService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class RomanceServiceImpl implements RomanceService {

    private static RomanceServiceImpl service = null;
    private RomanceRepository repository;

    private RomanceServiceImpl() {
        this.repository = RomanceRepositoryImpl.getRepository();
    }

    public static RomanceServiceImpl getService(){
        if (service == null) service = new RomanceServiceImpl();
        return service;
    }

    @Override
    public Set<Romance> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Romance create(Romance romance) {
        return this.repository.create(romance);
    }

    @Override
    public Romance update(Romance romance) {
        return this.repository.update(romance);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Romance read(String s) {
        return this.repository.read(s);
    }
}
