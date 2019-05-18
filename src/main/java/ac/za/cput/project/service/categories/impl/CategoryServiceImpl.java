package ac.za.cput.project.service.categories.impl;

import ac.za.cput.project.domain.categories.Category;
import ac.za.cput.project.repository.categories.CategoryRepository;
import ac.za.cput.project.repository.categories.impl.CategoryRepositoryImpl;
import ac.za.cput.project.service.categories.CategoryService;

import java.util.Set;

public class CategoryServiceImpl implements CategoryService {

    private static CategoryServiceImpl service = null;
    private CategoryRepository repository;

    private CategoryServiceImpl() {
        this.repository = CategoryRepositoryImpl.getRepository();
    }

    public static CategoryServiceImpl getService(){
        if (service == null) service = new CategoryServiceImpl();
        return service;
    }

    @Override
    public Set<Category> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Category create(Category category) {
        return this.repository.create(category);
    }

    @Override
    public Category update(Category category) {
        return this.repository.update(category);
    }

    @Override
    public void delete(String s) {
     this.repository.delete(s);
    }

    @Override
    public Category read(String s) {
        return this.repository.read(s);
    }
}
