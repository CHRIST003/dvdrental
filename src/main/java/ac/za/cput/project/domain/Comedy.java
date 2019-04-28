package ac.za.cput.project.domain;

public class Comedy extends Category {

    public Comedy(int categoryID, String name, String description) {
        super(categoryID, name, description);
    }

    public void NameOfCategory(){
        System.out.println("Comedy");
    }
}
