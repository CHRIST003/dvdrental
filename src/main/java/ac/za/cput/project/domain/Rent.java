package ac.za.cput.project.domain;

import java.util.Set;

public class Rent {

private String rentId;
private String custId;
private String DvdId;
private Set<Dvd> Dvd;

private Rent(){ }

private Rent(Builder builder){
    this.rentId = builder.rentId;
    this.custId = builder.custId;
    this.DvdId = builder.DvdId;

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

    public static class Builder{
        private String rentId;
        private String custId;
        private String DvdId;
        private Set<Dvd> Dvd;

        public Builder rentId(String rentId){
            this.rentId = rentId;
            return this;
        }

        public Builder custId(String custId){
            this.custId = custId;
            return this;
        }

        public Builder DvdId(String DvdId){
            this.DvdId = DvdId;
            return this;
        }

        public Rent build(){
            return new Rent(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "rentId='" + rentId + '\'' +
                    ", custId='" + custId + '\'' +
                    ", DvdId='" + DvdId + '\'' +
                    '}';
        }
    }
}
