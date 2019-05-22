package ac.za.cput.project.domain.categories;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public abstract class Category {

    private String CategoryID;
    private String Name;
    private String Description;


    public Category(String categoryID, String name, String description) {
        CategoryID = categoryID;
        Name = name;
        Description = description;

    }

    public Category() {
    }

    private Category(Builder builder) {
        this.CategoryID = builder.CategoryID;
        this.Name = builder.Name;
        this.Description = builder.Description;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }



    public static class Builder{

        private String CategoryID;
        private String Name;
        private String Description;


        public Builder CategoryID(String CategoryID) {
            this.CategoryID = CategoryID;
            return this;
        }

        public Builder Name(String Name) {
            this.Name = Name;
            return this;
        }

        public Builder Description(String Description) {
            this.Description = Description;
            return this;
        }

        public Builder copy(Category category){
            this.CategoryID = category.CategoryID;
            this.Name = category.Name;
            this.Description = category.Description;

            return this;
        }

//        public Category build() {
//            return new Action("5678","hjhgfhjk","");
//        }


    }

    @Override
    public String toString() {
        return "Category{" +
                "CategoryID='" + CategoryID + '\'' +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return CategoryID.equals(category.CategoryID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CategoryID);
    }
}
