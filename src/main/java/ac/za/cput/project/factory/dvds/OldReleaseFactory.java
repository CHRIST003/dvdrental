package ac.za.cput.project.factory.dvds;

import ac.za.cput.project.domain.dvds.OldRelease;
import ac.za.cput.project.util.Amr;

public class OldReleaseFactory {

    public static OldRelease getOldRelease(String DvdID, String Title, double price, boolean AvailableForRent, String Type, String date){
        return new OldRelease.Builder().DvdID(Amr.generateId())
                .DvdID(DvdID)
                .Title(Title)
                .price(price)
                .AvailableForRent(AvailableForRent)
                .Type(Type)
                .date(date)
                .build();

    }
}
