package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Category;

import java.util.Set;

public interface CategoryRepository extends IRepository<Category, String> {

    Set<Category>getAll();
}
