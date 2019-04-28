package ac.za.cput.project.domain;

public class Horror extends Category {

    public Horror(int categoryID, String name, String description) {
        super(categoryID, name, description);
    }

    public void NameOfCategory(){
        System.out.println("Horror");
    }
}
