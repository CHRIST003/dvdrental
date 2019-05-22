package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Cartoon;
import ac.za.cput.project.repository.categories.CartoonRepository;
import ac.za.cput.project.repository.categories.impl.CartoonRepositoryImpl;
import ac.za.cput.project.service.categories.CartoonService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CartoonServiceImpl implements CartoonService {

    private static CartoonServiceImpl service = null;
    private CartoonRepository repository;

    private CartoonServiceImpl() {
        this.repository = CartoonRepositoryImpl.getRepository();
    }

    public static CartoonServiceImpl getService(){
        if (service == null) service = new CartoonServiceImpl();
        return service;
    }

    @Override
    public Set<Cartoon> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Cartoon create(Cartoon cartoon) {
        return this.repository.create(cartoon);
    }

    @Override
    public Cartoon update(Cartoon cartoon) {
        return this.repository.update(cartoon);
    }

    @Override
    public void delete(String s) {
      this.repository.delete(s);
    }

    @Override
    public Cartoon read(String s) {
        return this.repository.read(s);
    }
}
