package ac.za.cput.project.repository.categories.impl;

import ac.za.cput.project.domain.categories.Action;
import ac.za.cput.project.repository.categories.ActionRepository;

import java.util.HashSet;
import java.util.Set;

public class ActionRepositoryImpl implements ActionRepository {

    private static ActionRepositoryImpl repository = null;
    private Set<Action> actions;

    private ActionRepositoryImpl(){
        this.actions = new HashSet<>();
    }

    private Action findAction(String CategoryID) {
        return this.actions.stream()
                .filter(category -> category.getCategoryID().trim().equals(CategoryID))
                .findAny()
                .orElse(null);
    }

    public static ActionRepositoryImpl getRepository(){
        if (repository == null) repository = new ActionRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Action> getAll() {
        return this.actions;
    }

    @Override
    public Action create(Action action) {
        this.actions.add(action);
        return null;
    }

    @Override
    public Action update(Action action) {

        Action toDelete = findAction(action.getCategoryID());
        if(toDelete != null) {
            this.actions.remove(toDelete);
            return create(action);
        }
        return null;
    }

    @Override
    public void delete(String CategoryID) {

        Action action = findAction(CategoryID);
        if (action != null) this.actions.remove(action);
    }

    @Override
    public Action read(final String CategoryID) {
        Action action = findAction(CategoryID);
        return action;
    }
}
