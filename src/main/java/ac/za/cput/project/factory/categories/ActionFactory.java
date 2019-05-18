package ac.za.cput.project.factory.categories;

import ac.za.cput.project.domain.categories.Action;
import ac.za.cput.project.util.Amr;

public class ActionFactory {
    public static Action getAction(String CategoryID, String Name, String Description){
        return new Action.Builder().CategoryID(Amr.generateId())
                .CategoryID(CategoryID)
                .Name(Name)
                .Description(Description)
                .build();

    }
}
