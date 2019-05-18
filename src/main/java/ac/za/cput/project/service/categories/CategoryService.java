package ac.za.cput.project.service.categories;

import ac.za.cput.project.domain.categories.Category;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface CategoryService extends IService<Category, String> {

        Set<Category> getAll();

        }
