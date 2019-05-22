package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Drama;
import ac.za.cput.project.repository.categories.DramaRepository;
import ac.za.cput.project.repository.categories.impl.DramaRepositoryImpl;
import ac.za.cput.project.service.categories.DramaService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DramaServiceImpl implements DramaService {

    private static DramaServiceImpl service = null;
    private DramaRepository repository;

    private DramaServiceImpl() {
        this.repository = DramaRepositoryImpl.getRepository();
    }

    public static DramaServiceImpl getService(){
        if (service == null) service = new DramaServiceImpl();
        return service;
    }

    @Override
    public Set<Drama> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Drama create(Drama drama) {
        return this.repository.create(drama);
    }

    @Override
    public Drama update(Drama drama) {
        return this.repository.update(drama);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Drama read(String s) {
        return this.repository.read(s);
    }
}
