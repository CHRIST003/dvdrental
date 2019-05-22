package ac.za.cput.project.service.rents.impl;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.repository.rents.RentRepository;
import ac.za.cput.project.repository.rents.impl.RentRepositoryImpl;
import ac.za.cput.project.service.rents.RentService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class RentServiceImpl implements RentService {

    private static RentServiceImpl service = null;
    private RentRepository repository;

    private RentServiceImpl() {
        this.repository = RentRepositoryImpl.getRepository();
    }

    public static RentServiceImpl getService(){
        if (service == null) service = new RentServiceImpl();
        return service;
    }

    @Override
    public Set<Rent> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Rent create(Rent rent) {
        return this.repository.create(rent);
    }

    @Override
    public Rent update(Rent rent) {
        return this.repository.update(rent);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Rent read(String s) {
        return this.repository.read(s);
    }
}
