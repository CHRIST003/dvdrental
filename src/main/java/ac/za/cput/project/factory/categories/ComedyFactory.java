package ac.za.cput.project.factory.categories;

import ac.za.cput.project.domain.categories.Comedy;
import ac.za.cput.project.util.Amr;

public class ComedyFactory {

    public static Comedy getComedy(String CategoryID, String Name, String Description) {
        return new Comedy.Builder().CategoryID(Amr.generateId())
                .CategoryID(CategoryID)
                .Name(Name)
                .Description(Description)
                .build();

    }
}
