package ac.za.cput.project;


import ac.za.cput.project.domain.Sale;
import ac.za.cput.project.util.Amr;

public class SaleFactory {

    public static Sale getSale(String saleID,String CustID, String DvdID, String CustName,  String CustLastName, long phoneNumber
    ,double CustCredit, String DvdTitle, String Categogy,  double price){
        return new Sale.Builder().saleID(Amr.generateId())
                .saleID(saleID)
                .CustID(CustID)
                .DvdID(DvdID)
                .CustName(CustName)
                .CustLastName(CustLastName)
                .phoneNumber(phoneNumber)
                .CustCredit(CustCredit)
                .DvdTitle(DvdTitle)
                .Categogy(Categogy)
                .price(price)
                .build();
    }
}
