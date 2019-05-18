package ac.za.cput.project.domain.customers;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public abstract class Customer {

    private String CustID;
    private String Name;
    private String LastName;
    private boolean CanBuy;
    private boolean CanRent;
    private double credit;
    private String type;

    public Customer(String custID, String name, String lastName, boolean canBuy, boolean canRent, double credit, String type) {
        CustID = custID;
        Name = name;
        LastName = lastName;
        CanBuy = canBuy;
        CanRent = canRent;
        this.credit = credit;
        this.type = type;
    }

    public Customer() {
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

    public boolean isCanBuy() {
        return CanBuy;
    }

    public boolean isCanRent() {
        return CanRent;
    }

    public double getCredit() {
        return credit;
    }

    public String getType() {
        return type;
    }

    public static class Builder{

        private String CustID;
        private String Name;
        private String LastName;
        private boolean CanBuy;
        private boolean CanRent;
        private double credit;
        private String type;

        public Builder CustID(String CustID) {
            this.CustID = CustID;
            return this;
        }

        public Builder Name(String Name) {
            this.Name = Name;
            return this;
        }

        public Builder LastName(String LastName) {
            this.LastName = LastName;
            return this;
        }

        public Builder CanBuy(boolean CanBuy) {
            this.CanBuy = CanBuy;
            return this;
        }

        public Builder CanRent(boolean CanRent) {
            this.CanRent = CanRent;
            return this;
        }

        public Builder credit(double credit) {
            this.credit = credit;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustID='" + CustID + '\'' +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", CanBuy=" + CanBuy +
                ", CanRent=" + CanRent +
                ", credit=" + credit +
                ", type='" + type + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Customer customer = (Customer) o;
//        return CustID.equals(customer.CustID);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(CustID);
//    }

}
