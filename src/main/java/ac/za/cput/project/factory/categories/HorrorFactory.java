package ac.za.cput.project.factory.categories;

import ac.za.cput.project.domain.categories.Horror;
import ac.za.cput.project.util.Amr;

public class HorrorFactory {

    public static Horror getHorror(String CategoryID, String Name, String Description) {
        return new Horror.Builder().CategoryID(Amr.generateId())
                .CategoryID(CategoryID)
                .Name(Name)
                .Description(Description)
                .build();

    }
}
