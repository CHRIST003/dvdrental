package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.Category;
import ac.za.cput.project.repository.CategoryRepository;

import java.util.HashSet;
import java.util.Set;

public class CategoryRepositoryImpl implements CategoryRepository {



    private static CategoryRepositoryImpl repository = null;
    private Set<Category> categories;

    private CategoryRepositoryImpl(){
        this.categories = new HashSet<>();
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
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Category read(String s) {
        return null;
    }

    @Override
    public Set<Category> getAll() {
        return null;
    }

}
