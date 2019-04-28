package ac.za.cput.project.factory;


import ac.za.cput.project.domain.Rent;
import ac.za.cput.project.util.Amr;

public class RentFactory {

    public static Rent getRent(String rentId, String custId, String DvdId,  String CustName,String CustLastName, String phoneNumber
    ,double customerCredit, String DvdTitle, String category,double price){
        return new Rent.Builder().rentId(Amr.generateId())
                .rentId(rentId)
                .custId(custId)
                .DvdId(DvdId)
                .CustName(CustName)
                .CustLastName(CustLastName)
                .phoneNumber(phoneNumber)
                .customerCredit(customerCredit)
                .DvdTitle(DvdTitle)
                .category(category)
                .price(price)
                .build();
    }


}
