package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Action;
import ac.za.cput.project.repository.categories.ActionRepository;
import ac.za.cput.project.repository.categories.impl.ActionRepositoryImpl;
import ac.za.cput.project.service.categories.ActionService;

import java.util.Set;

public class ActionServiceImpl implements ActionService {

    private static ActionServiceImpl service = null;
    private ActionRepository repository;

    private ActionServiceImpl() {
        this.repository = ActionRepositoryImpl.getRepository();
    }

    public static ActionServiceImpl getService(){
        if (service == null) service = new ActionServiceImpl();
        return service;
    }


    @Override
    public Set<Action> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Action create(Action action) {
        return this.repository.create(action);
    }

    @Override
    public Action update(Action action) {
        return this.repository.update(action);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Action read(String s) {
        return this.repository.read(s);
    }
}
