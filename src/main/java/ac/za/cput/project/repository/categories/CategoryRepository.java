package ac.za.cput.project.repository.categories;

import ac.za.cput.project.domain.categories.Category;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface CategoryRepository extends IRepository<Category, String> {

    Set<Category>getAll();
}
