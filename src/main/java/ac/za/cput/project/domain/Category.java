package ac.za.cput.project.domain;

import java.util.Random;

public abstract class Category {

    private int CategoryID;
    private String Name;
    private String Description;

    private int getCategoryID()
    {
        Random random = new Random();
        CategoryID = random.nextInt(89999) + 10000;
        return CategoryID;
    }

    public Category(int categoryID, String name, String description) {

        CategoryID = getCategoryID();
        Name = name;
        Description = description;
    }

    public void NameOfCategory(){ }


    @Override
    public String toString() {
        return "Category{" +
                "CategoryID=" + CategoryID +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
