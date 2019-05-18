package ac.za.cput.project.domain.customers;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;


@EntityScan
public class Members extends Customer {

    private String CustID;
    private String Name;
    private String LastName;
    private boolean CanBuy;
    private boolean CanRent;
    private double credit;
    private String type;

    private Members(String custID, String name, String lastName, boolean canBuy, boolean canRent, double credit, String type, String custID1, String name1, String lastName1, boolean canBuy1, boolean canRent1, double credit1, String type1) {
        super(custID, name, lastName, canBuy, canRent, credit, type);
        CustID = custID1;
        Name = name1;
        LastName = lastName1;
        CanBuy = canBuy1;
        CanRent = canRent1;
        this.credit = credit1;
        this.type = type1;
    }

    private Members(){

    }

    private Members(Builder builder) {
        this.CustID = builder.CustID;
        this.Name = builder.Name;
        this.LastName = builder.LastName;
        this.CanBuy = builder.CanBuy;
        this.CanRent = builder.CanRent;
        this.credit = builder.credit;
        this.type = builder.type;
    }

    @Override
    public String getCustID() {
        return CustID;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public boolean isCanBuy() {
        return CanBuy;
    }

    @Override
    public boolean isCanRent() {
        return CanRent;
    }

    @Override
    public double getCredit() {
        return credit;
    }

    @Override
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

        public Builder copy(Members members){
            this.CustID = members.CustID;
            this.Name = members.Name;
            this.LastName = members.LastName;
            this.CanBuy = members.CanBuy;
            this.CanRent = members.CanRent;
            this.credit = members.credit;
            this.type = members.type;

            return this;
        }

        public Members build() {
            return new Members(this);
        }
    }

    @Override
    public String toString() {
        return "Members{" +
                "CustID='" + CustID + '\'' +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", CanBuy=" + CanBuy +
                ", CanRent=" + CanRent +
                ", credit=" + credit +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Members members = (Members) o;
        return CustID.equals(members.CustID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CustID);
    }
}
