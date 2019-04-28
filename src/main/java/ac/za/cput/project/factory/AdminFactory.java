package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Admin;
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
