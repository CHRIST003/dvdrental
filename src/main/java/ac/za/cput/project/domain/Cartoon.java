package ac.za.cput.project.domain;

public class Cartoon extends Category {

    public Cartoon(int categoryID, String name, String description) {
        super(categoryID, name, description);
    }

    public void NameOfCategory(){
        System.out.println("Cartoon");
    }
}
