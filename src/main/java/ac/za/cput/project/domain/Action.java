package ac.za.cput.project.domain;

public class Action extends Category {

    public Action(int categoryID, String name, String description) {
        super(categoryID, name, description);
    }

    public void NameOfCategory(){
        System.out.println("Action");
    }
}
