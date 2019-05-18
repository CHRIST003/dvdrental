package ac.za.cput.project.factory.categories;

import ac.za.cput.project.domain.categories.Cartoon;
import ac.za.cput.project.util.Amr;

public class CartoonFactory {

    public static Cartoon getCartoon(String CategoryID, String Name, String Description) {
        return new Cartoon.Builder().CategoryID(Amr.generateId())
                .CategoryID(CategoryID)
                .Name(Name)
                .Description(Description)
                .build();

    }
}
