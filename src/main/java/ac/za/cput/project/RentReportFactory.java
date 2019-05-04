package ac.za.cput.project;


import ac.za.cput.project.domain.RentReport;
import ac.za.cput.project.util.Amr;


public class RentReportFactory {

    public static RentReport getRentReport(String RentID,String rentedDate,String returnedDate,String CustomerID,String DvdID, double AmountPaid){
        return new RentReport.Builder().RentID(Amr.generateId())
                .RentID(RentID)
                .rentedDate(rentedDate)
                .returnedDate(returnedDate)
                .CustomerID(CustomerID)
                .DvdID(DvdID)
                .AmountPaid(AmountPaid)
                .build();
    }


}


