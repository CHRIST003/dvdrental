package ac.za.cput.project.factory;

import ac.za.cput.project.domain.SaleReport;
import ac.za.cput.project.util.Amr;

public class SaleReportFactory {

    public static SaleReport getSaleReport( String SaleID,String date,String CustID,String CustName,String DvdID,int QtyOfDvd
    ,double TotalOfMoneyPaid){
        return new SaleReport.Builder().SaleID(Amr.generateId())
                .SaleID(SaleID)
                .date(date)
                .CustID(CustID)
                .CustName(CustName)
                .DvdID(DvdID)
                .QtyOfDvd(QtyOfDvd)
                .TotalOfMoneyPaid(TotalOfMoneyPaid)
                .build();
    }
}
