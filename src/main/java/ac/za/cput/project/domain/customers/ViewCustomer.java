package ac.za.cput.project.domain.customers;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class ViewCustomer {

    private String CustID;
    private String Name;
    private String LastName;
    private String PhoneNumber;
    private double Credit;

    private ViewCustomer(){

    }

    private ViewCustomer(Builder builder){
        this.CustID = builder.CustID;
        this.Name = builder.Name;
        this.LastName = builder.LastName;
        this.PhoneNumber = builder.PhoneNumber;
        this.Credit = builder.Credit;

    }

    public String getCustID() {
        return CustID;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public double getCredit() {
        return Credit;
    }

    public static class Builder{

        private String CustID;
        private String Name;
        private String LastName;
        private String PhoneNumber;
        private double Credit;

        public Builder CustID(String CustID){
            this.CustID = CustID;
            return this;
        }

        public Builder Name(String Name){
            this.Name = Name;
            return this;
        }

        public Builder LastName(String LastName){
            this.LastName = LastName;
            return this;
        }

        public Builder PhoneNumber(String PhoneNumber){
            this.PhoneNumber = PhoneNumber;
            return this;
        }

        public Builder Credit(double Credit){
            this.Credit = Credit;
            return this;
        }

        public Builder copy(ViewCustomer viewCustomer){
            this.CustID = viewCustomer.CustID;
            this.Name = viewCustomer.Name;
            this.LastName = viewCustomer.LastName;
            this.PhoneNumber = viewCustomer.PhoneNumber;
            this.Credit = viewCustomer.Credit;
            return this;

        }

        public ViewCustomer build(){
            return new ViewCustomer(this);
        }

    }

    @Override
    public String toString() {
        return "ViewCustomer{" +
                "CustID='" + CustID + '\'' +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Credit=" + Credit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewCustomer viewCustomer = (ViewCustomer) o;
        return CustID.equals(viewCustomer.CustID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CustID);
    }
}


