package ac.za.cput.project.domain.categories;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Comedy extends Category {

    private String CategoryID;
    private String Name;
    private String Description;

    public Comedy(String categoryID, String name, String description) {
        super(categoryID, name, description);
    }

    private Comedy(){

    }

    private Comedy(Builder builder) {
        this.CategoryID = builder.CategoryID;
        this.Name = builder.Name;
        this.Description = builder.Description;
    }

    @Override
    public String getCategoryID() {
        return CategoryID;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
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

        public Builder copy(Comedy comedy){
            this.CategoryID = comedy.CategoryID;
            this.Name = comedy.Name;
            this.Description = comedy.Description;

            return this;
        }

        public Comedy build() {
            return new Comedy(this);
        }

    }

    @Override
    public String toString() {
        return "Comedy{" +
                "CategoryID='" + CategoryID + '\'' +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comedy comedy = (Comedy) o;
        return CategoryID.equals(comedy.CategoryID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CategoryID);
    }
}
