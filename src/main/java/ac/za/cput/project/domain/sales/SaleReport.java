package ac.za.cput.project.domain.sales;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class SaleReport {

    private String SaleID;
    private String date;
    private String CustID;
    private String CustName;
    private String DvdID;
    private int QtyOfDvd;
    private double TotalOfMoneyPaid;


    private SaleReport(){

    }

    private SaleReport(Builder builder){

        this.SaleID = builder.SaleID;
        this.date = builder.date;
        this.CustID = builder.CustID;
        this.CustName = builder.CustName;
        this.DvdID = builder.DvdID;
        this.QtyOfDvd = builder.QtyOfDvd;
        this.TotalOfMoneyPaid = builder.TotalOfMoneyPaid;

    }

    public String getSaleID() {
        return SaleID;
    }

    public String getDate() {
        return date;
    }

    public String getCustID() {
        return CustID;
    }

    public String getCustName() {
        return CustName;
    }

    public String getDvdID() {
        return DvdID;
    }

    public int getQtyOfDvd() {
        return QtyOfDvd;
    }

    public double getTotalOfMoneyPaid() {
        return TotalOfMoneyPaid;
    }

    public static class Builder{

        private String SaleID;
        private String date;
        private String CustID;
        private String CustName;
        private String DvdID;
        private int QtyOfDvd;
        private double TotalOfMoneyPaid;

        public Builder SaleID(String SaleID){
            this.SaleID = SaleID;
            return this;
        }

        public Builder date (String date){
            this.date = date;
            return this;
        }

        public Builder CustID(String CustID){
            this.CustID = CustID;
            return this;
        }

        public Builder CustName(String CustName){
            this.CustName = CustName;
            return this;
        }

        public Builder DvdID(String DvdID){
            this.DvdID = DvdID;
            return this;
        }

        public Builder QtyOfDvd(int QtyOfDvd){
            this.QtyOfDvd = QtyOfDvd;
            return this;
        }

        public Builder TotalOfMoneyPaid(double TotalOfMoneyPaid){
            this.TotalOfMoneyPaid = TotalOfMoneyPaid;
            return this;
        }

        public Builder copy(SaleReport saleReport) {

            this.SaleID = saleReport.SaleID;
            this.date = saleReport.date;
            this.CustID = saleReport.CustID;
            this.CustName = saleReport.CustName;
            this.DvdID = saleReport.DvdID;
            this.QtyOfDvd = saleReport.QtyOfDvd;
            this.TotalOfMoneyPaid = saleReport.TotalOfMoneyPaid;

            return this;
        }



        public SaleReport build(){
            return new SaleReport(this);
        }
    }

    @Override
    public String toString() {
        return "SaleReport{" +
                "SaleID='" + SaleID + '\'' +
                ", date='" + date + '\'' +
                ", CustID='" + CustID + '\'' +
                ", CustName='" + CustName + '\'' +
                ", DvdID='" + DvdID + '\'' +
                ", QtyOfDvd=" + QtyOfDvd +
                ", TotalOfMoneyPaid=" + TotalOfMoneyPaid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleReport saleReport = (SaleReport) o;
        return SaleID.equals(saleReport.SaleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SaleID);
    }
}
