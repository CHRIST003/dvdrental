package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Category;
import ac.za.cput.project.CategoryFactory;
import org.junit.Test;

public class CategoryFactoryTest {

    @Test
    public void createCategory() {

        Category category = CategoryFactory.CreateCategory("Comedy");
        category.NameOfCategory();
    }
}