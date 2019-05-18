package ac.za.cput.project.domain.rents;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;

@EntityScan
public class Rent {

private String rentId;
private String custId;
private String DvdId;
private String CustName;
private String CustLastName;
private String phoneNumber;
private double customerCredit;
private String DvdTitle;
private String category;
private double price;


private Set<ac.za.cput.project.domain.dvds.Dvd> Dvd;

private Rent(){ }

private Rent(Builder builder){
    this.rentId = builder.rentId;
    this.custId = builder.custId;
    this.DvdId = builder.DvdId;
    this.CustName = builder.CustName;
    this.CustLastName = builder.CustLastName;
    this.phoneNumber = builder.phoneNumber;
    this.customerCredit = builder.customerCredit;
    this.DvdTitle = builder.DvdTitle;
    this.category = builder.category;
    this.price = builder.price;

  }

    public String getRentId() {
        return rentId;
    }

    public String getCustId() {
        return custId;
    }

    public String getDvdId() {
        return DvdId;
    }

    public String getCustName() {
        return CustName;
    }

    public String getCustLastName() {
        return CustLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getCustomerCredit() {
        return customerCredit;
    }

    public String getDvdTitle() {
        return DvdTitle;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder{
        private String rentId;
        private String custId;
        private String DvdId;
        private String CustName;
        private String CustLastName;
        private String phoneNumber;
        private double customerCredit;
        private String DvdTitle;
        private String category;
        private double price;

        public Builder rentId(String rentId){
            this.rentId = rentId;
            return this;
        }

        public Builder custId(String custId){
            this.custId = custId;
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

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder customerCredit(double customerCredit){
            this.customerCredit = customerCredit;
            return this;
        }

        public Builder DvdTitle(String DvdTitle){
            this.DvdTitle = DvdTitle;
            return this;
        }

        public Builder category(String category){
            this.category = category;
            return this;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder DvdId(String DvdId){
            this.DvdId = DvdId;
            return this;
        }


        public Builder copy(Rent rent) {

            this.rentId = rent.rentId;
            this.custId = rent.custId;
            this.DvdId = rent.DvdId;
            this.CustName = rent.CustName;
            this.CustLastName = rent.CustLastName;
            this.phoneNumber = rent.phoneNumber;
            this.customerCredit = rent.customerCredit;
            this.DvdTitle = rent.DvdTitle;
            this.category = rent.category;
            this.price = rent.price;

            return this;
        }


        public Rent build(){
            return new Rent(this);
        }


    }

    @Override
    public String toString() {
        return "Builder{" +
                "rentId='" + rentId + '\'' +
                ", custId='" + custId + '\'' +
                ", DvdId='" + DvdId + '\'' +
                ", CustName='" + CustName + '\'' +
                ", CustLastName='" + CustLastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", customerCredit=" + customerCredit +
                ", DvdTitle='" + DvdTitle + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
