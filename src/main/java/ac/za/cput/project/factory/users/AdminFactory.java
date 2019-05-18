package ac.za.cput.project.factory.users;

import ac.za.cput.project.domain.users.Admin;
import ac.za.cput.project.util.Amr;

public class AdminFactory {

    public static Admin getAdmin(String AdID, String name, String LastName){
        return new Admin.Builder().AdID(Amr.generateId())
                .AdID(AdID)
                .name(name)
                .LastName(LastName)
                .build();
    }
}
