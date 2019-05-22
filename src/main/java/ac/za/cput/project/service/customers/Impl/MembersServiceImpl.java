package ac.za.cput.project.service.customers.Impl;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.repository.customers.MembersRepository;
import ac.za.cput.project.repository.customers.impl.MembersRepositoryImpl;
import ac.za.cput.project.service.customers.MembersService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MembersServiceImpl implements MembersService {

    private static MembersServiceImpl service = null;
    private MembersRepository repository;

    private MembersServiceImpl() {
        this.repository = MembersRepositoryImpl.getRepository();
    }

    public static MembersServiceImpl getService(){
        if (service == null) service = new MembersServiceImpl();
        return service;
    }

    @Override
    public Set<Members> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Members create(Members members) {
        return this.repository.create(members);
    }

    @Override
    public Members update(Members members) {
        return this.repository.update(members);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public Members read(String s) {
        return this.repository.read(s);
    }
}
