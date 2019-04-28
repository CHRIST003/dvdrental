package ac.za.cput.project.domain;

public class Drama extends Category {

    public Drama(int categoryID, String name, String description) {
        super(categoryID, name, description);
    }

    public void NameOfCategory(){
        System.out.println("Comedy");
    }
}
