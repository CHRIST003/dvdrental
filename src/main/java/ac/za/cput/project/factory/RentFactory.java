package ac.za.cput.project.factory;


import ac.za.cput.project.domain.Rent;
import ac.za.cput.project.util.Amr;

public class RentFactory {

    public static Rent getRent(String rentId, String custId, String DvdId){
        return new Rent.Builder().rentId(Amr.generateId())
                .custId(custId)
                .DvdId(DvdId)
                .build();
    }
}
