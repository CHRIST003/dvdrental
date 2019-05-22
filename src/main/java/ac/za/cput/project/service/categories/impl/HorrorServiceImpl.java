package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Horror;
import ac.za.cput.project.repository.categories.HorrorRepository;
import ac.za.cput.project.repository.categories.impl.HorrorRepositoryImpl;
import ac.za.cput.project.service.categories.HorrorService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class HorrorServiceImpl implements HorrorService {

    private static HorrorServiceImpl service = null;
    private HorrorRepository repository;

    private HorrorServiceImpl() {
        this.repository = HorrorRepositoryImpl.getRepository();
    }

    public static HorrorServiceImpl getService(){
        if (service == null) service = new HorrorServiceImpl();
        return service;
    }

    @Override
    public Set<Horror> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Horror create(Horror horror) {
        return this.repository.create(horror);
    }

    @Override
    public Horror update(Horror horror) {
        return this.repository.update(horror);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Horror read(String s) {
        return this.repository.read(s);
    }
}
