package ac.za.cput.project.factory.categories;

import ac.za.cput.project.domain.categories.Romance;
import ac.za.cput.project.util.Amr;

public class RomanceFactory {

    public static Romance getRomance(String CategoryID, String Name, String Description) {
        return new Romance.Builder().CategoryID(Amr.generateId())
                .CategoryID(CategoryID)
                .Name(Name)
                .Description(Description)
                .build();

    }
}
