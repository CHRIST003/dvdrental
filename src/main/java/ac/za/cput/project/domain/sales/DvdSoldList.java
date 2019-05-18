package ac.za.cput.project.domain.sales;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class DvdSoldList {

    private String DvdSaleListID;
    private  int QtyOfDvd;
    private double Total;


    private DvdSoldList(){

    }

    private DvdSoldList(Builder builder){

        this.DvdSaleListID = builder.DvdSaleListID;
        this.QtyOfDvd = builder.QtyOfDvd;
        this.Total = builder.Total;
    }


    public String getDvdSaleListID() {
        return DvdSaleListID;
    }

    public int getQtyOfDvd() {
        return QtyOfDvd;
    }

    public double getTotal() {
        return Total;
    }

    public static class Builder{

        private String DvdSaleListID;
        private  int QtyOfDvd;
        private double Total;


        public Builder DvdSaleListID(String DvdSaleListID){
            this.DvdSaleListID = DvdSaleListID;
            return this;
        }

        public Builder QtyOfDvd(int QtyOfDvd){
            this.QtyOfDvd = QtyOfDvd;
            return this;
        }

        public Builder Total(double Total){
            this.Total = Total;
            return this;
        }

        public Builder copy(DvdSoldList dvdSoldList) {
            this.DvdSaleListID = dvdSoldList.DvdSaleListID;
            this.QtyOfDvd = dvdSoldList.QtyOfDvd;
            this.Total = dvdSoldList.Total;

            return this;
        }

        public DvdSoldList build(){
            return new DvdSoldList(this);
        }
    }
}
