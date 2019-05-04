package ac.za.cput.project;

import ac.za.cput.project.domain.DvdSoldList;
import ac.za.cput.project.util.Amr;

public class DvdSoldListFactory {

    public static DvdSoldList getDvdSoldList(String DvdSaleListID, int QtyOfDvd, double Total){
        return new DvdSoldList.Builder().DvdSaleListID(Amr.generateId())
                .DvdSaleListID(DvdSaleListID)
                .QtyOfDvd(QtyOfDvd)
                .Total(Total)
                .build();
    }
}
