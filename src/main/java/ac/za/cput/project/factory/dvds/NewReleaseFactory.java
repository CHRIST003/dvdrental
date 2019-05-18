package ac.za.cput.project.factory.dvds;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.util.Amr;

public class NewReleaseFactory {

    public static NewRelease getNewRelease(String DvdID,String Title,double price,boolean AvailableForRent,String Type,String date){
        return new NewRelease.Builder().DvdID(Amr.generateId())
                .DvdID(DvdID)
                .Title(Title)
                .price(price)
                .AvailableForRent(AvailableForRent)
                .Type(Type)
                .date(date)
                .build();

    }
}
