package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Category;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryFactoryTest {

    @Test
    public void createCategory() {

        Category category = CategoryFactory.CreateCategory("Comedy");
        category.NameOfCategory();
    }
}