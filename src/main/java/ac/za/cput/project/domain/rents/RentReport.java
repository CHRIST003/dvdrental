package ac.za.cput.project.domain.rents;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class RentReport {

    private String RentID;
    private String rentedDate;
    private String returnedDate;
    private String CustomerID;
    private String DvdID;
    private double AmountPaid;

    private RentReport(){

    }

    private RentReport(Builder builder){

        this.RentID = builder.RentID;
        this.rentedDate = builder.rentedDate;
        this.returnedDate = builder.returnedDate;
        this.CustomerID = builder.CustomerID;
        this.DvdID = builder.DvdID;
        this.AmountPaid = builder.AmountPaid;

    }


    public String getRentID() {
        return RentID;
    }

    public String getRentedDate() {
        return rentedDate;
    }

    public String getReturnedDate() {
        return returnedDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getDvdID() {
        return DvdID;
    }

    public double getAmountPaid() {
        return AmountPaid;
    }

    public static class Builder{

        private String RentID;
        private String rentedDate;
        private String returnedDate;
        private String CustomerID;
        private String DvdID;
        private double AmountPaid;

        public Builder RentID(String RentID){
            this.RentID = RentID;
            return this;
        }

        public Builder rentedDate(String rentedDate){
            this.rentedDate = rentedDate;
            return this;
        }

        public Builder returnedDate(String returnedDate){
            this.returnedDate = returnedDate;
            return this;
        }

        public Builder CustomerID(String CustomerID){
            this.CustomerID = CustomerID;
            return this;
        }

        public Builder DvdID(String DvdID){
            this.DvdID = DvdID;
            return this;
        }

        public Builder AmountPaid(double AmountPaid){
            this.AmountPaid = AmountPaid;
            return this;
        }

        public RentReport build(){
            return new RentReport(this);
        }


    }

    @Override
    public String toString() {
        return "RentReport{" +
                "RentID='" + RentID + '\'' +
                ", rentedDate=" + rentedDate +
                ", returnedDate=" + returnedDate +
                ", CustomerID='" + CustomerID + '\'' +
                ", DvdID='" + DvdID + '\'' +
                ", AmountPaid=" + AmountPaid +
                '}';
    }
}
