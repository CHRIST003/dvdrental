package ac.za.cput.project.repository.categories.impl;

import ac.za.cput.project.domain.categories.Cartoon;
import ac.za.cput.project.repository.categories.CartoonRepository;

import java.util.HashSet;
import java.util.Set;

public class CartoonRepositoryImpl implements CartoonRepository {

    private static CartoonRepositoryImpl repository = null;
    private Set<Cartoon> cartoons;

    private CartoonRepositoryImpl(){
        this.cartoons = new HashSet<>();
    }

    private Cartoon findCartoon(String CategoryID) {
        return this.cartoons.stream()
                .filter(category -> category.getCategoryID().trim().equals(CategoryID))
                .findAny()
                .orElse(null);
    }

    public static CartoonRepositoryImpl getRepository(){
        if (repository == null) repository = new CartoonRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Cartoon> getAll() {
        return this.cartoons;
    }

    @Override
    public Cartoon create(Cartoon cartoon) {
        this.cartoons.add(cartoon);
        return null;
    }

    @Override
    public Cartoon update(Cartoon cartoon) {

        Cartoon toDelete = findCartoon(cartoon.getCategoryID());
        if(toDelete != null) {
            this.cartoons.remove(toDelete);
            return create(cartoon);
        }
        return null;
    }

    @Override
    public void delete(String CategoryID) {

        Cartoon cartoon = findCartoon(CategoryID);
        if (cartoon != null) this.cartoons.remove(cartoon);
    }

    @Override
    public Cartoon read(final String CategoryID) {
        Cartoon action = findCartoon(CategoryID);
        return action;
    }
}
