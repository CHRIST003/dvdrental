package ac.za.cput.project.repository.categories.impl;

import ac.za.cput.project.domain.categories.Category;
import ac.za.cput.project.repository.categories.CategoryRepository;

import java.util.HashSet;
import java.util.Set;

public class CategoryRepositoryImpl implements CategoryRepository {


    private static CategoryRepositoryImpl repository = null;
    private Set<Category> categories;

    private CategoryRepositoryImpl(){
        this.categories = new HashSet<>();
    }

    private Category findCategory(String CategoryID) {
        return this.categories.stream()
                .filter(category -> category.getCategoryID().trim().equals(CategoryID))
                .findAny()
                .orElse(null);
    }

    public static CategoryRepositoryImpl getRepository(){

        if(repository == null) repository = new CategoryRepositoryImpl();
        return repository;
    }

    @Override
    public Category create(Category category) {

        this.categories.add(category);
        return category;
    }

    @Override
    public Category update(Category category) {

        Category toDelete = findCategory(category.getCategoryID());
        if(toDelete != null) {
            this.categories.remove(toDelete);
            return create(category);
        }
        return null;
    }

    @Override
    public void delete(String CategoryID) {

        Category category = findCategory(CategoryID);
        if (category != null) this.categories.remove(category);

    }

    @Override
    public Category read(final String CategoryID) {
        Category course = findCategory(CategoryID);
        return null;
    }

    @Override
    public Set<Category> getAll() {

        return this.categories;
    }

}
