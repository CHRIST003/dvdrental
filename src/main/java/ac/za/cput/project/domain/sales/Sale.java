package ac.za.cput.project.domain.sales;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Sale {

    private String saleID;
    private String CustID;
    private String DvdID;
    private String CustName;
    private String CustLastName;
    private long phoneNumber;
    private double CustCredit;
    private String DvdTitle;
    private String Categogy;
    private double price;


    private Sale(){

    }

    private Sale(Builder builder){
        this.saleID = builder.saleID;
        this.CustID = builder.CustID;
        this.DvdID = builder.DvdID;
        this.CustName = builder.CustName;
        this.CustLastName = builder.CustLastName;
        this.phoneNumber = builder.phoneNumber;
        this.CustCredit = builder.CustCredit;
        this.DvdTitle = builder.DvdTitle;
        this.Categogy = builder.Categogy;
        this.price = builder.price;

    }


    public String getSaleID() {
        return saleID;
    }

    public String getCustID() {
        return CustID;
    }

    public String getDvdID() {
        return DvdID;
    }

    public String getCustName() {
        return CustName;
    }

    public String getCustLastName() {
        return CustLastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getCustCredit() {
        return CustCredit;
    }

    public String getDvdTitle() {
        return DvdTitle;
    }

    public String getCategogy() {
        return Categogy;
    }

    public double getPrice() {
        return price;
    }


    public static class Builder{

        private String saleID;
        private String CustID;
        private String DvdID;
        private String CustName;
        private String CustLastName;
        private long phoneNumber;
        private double CustCredit;
        private String DvdTitle;
        private String Categogy;
        private double price;


        public Builder saleID(String saleID){
            this.saleID = saleID;
            return this;
        }

        public Builder CustID(String CustID){
            this.CustID = CustID;
            return this;
        }

        public Builder DvdID(String DvdID){
            this.DvdID = DvdID;
            return this;
        }

        public Builder CustName(String CustName){
            this.CustName = CustName;
            return this;
        }

        public Builder CustLastName(String CustLastName){
            this.CustLastName = CustLastName;
            return this;
        }

        public Builder phoneNumber(long phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder CustCredit(double CustCredit){
            this.CustCredit = CustCredit;
            return this;
        }

        public Builder DvdTitle(String DvdTitle){
            this.DvdTitle = DvdTitle;
            return this;
        }

        public Builder Categogy(String Categogy){
            this.Categogy = Categogy;
            return this;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }


        public Builder copy(Sale sale) {

            this.saleID = sale.saleID;
            this.CustID = sale.CustID;
            this.DvdID = sale.DvdID;
            this.CustName = sale.CustName;
            this.CustLastName = sale.CustLastName;
            this.phoneNumber = sale.phoneNumber;
            this.DvdTitle = sale.DvdTitle;
            this.CustCredit = sale.CustCredit;
            this.price = sale.price;
            this.Categogy = sale.Categogy;
            return this;
        }


        public Sale build(){
            return new Sale(this);
        }

    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleID='" + saleID + '\'' +
                ", CustID='" + CustID + '\'' +
                ", DvdID='" + DvdID + '\'' +
                ", CustName='" + CustName + '\'' +
                ", CustLastName='" + CustLastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", CustCredit=" + CustCredit +
                ", DvdTitle='" + DvdTitle + '\'' +
                ", Categogy='" + Categogy + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return saleID.equals(sale.saleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleID);
    }
}
