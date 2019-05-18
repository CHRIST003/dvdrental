package ac.za.cput.project.factory.categories;

import ac.za.cput.project.domain.categories.Drama;
import ac.za.cput.project.util.Amr;

public class DramaFactory {

    public static Drama getDrama(String CategoryID, String Name, String Description) {
        return new Drama.Builder().CategoryID(Amr.generateId())
                .CategoryID(CategoryID)
                .Name(Name)
                .Description(Description)
                .build();

    }
}
