package ac.za.cput.project.domain;

public class Romance extends Category {

    public Romance(int categoryID, String name, String description) {
        super(categoryID, name, description);
    }

    public void NameOfCategory(){
        System.out.println("Romance");
    }
}
