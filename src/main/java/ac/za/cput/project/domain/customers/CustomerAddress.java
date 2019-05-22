package ac.za.cput.project.domain.customers;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class CustomerAddress {

    private String physicalAddress;
    private String postalAddress;
    private int postCode;

    private CustomerAddress(){

    }

    public CustomerAddress(Builder builder){

        this.physicalAddress = builder.physicalAddress;
        this.postalAddress = builder.postalAddress;
        this.postCode = builder.postCode;

    }


    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public int getPostCode() {
        return postCode;
    }

    public static class Builder{

        private String physicalAddress;
        private String postalAddress;
        private int postCode;

        public Builder physicalAddress(String physicalAddress){
            this.physicalAddress = physicalAddress;
            return this;
        }

        public Builder postalAddress(String postalAddress){
            this.postalAddress = postalAddress;
            return this;
        }

        public Builder postCode(int postCode){
            this.postCode = postCode;
            return this;
        }

        public Builder copy(CustomerAddress customerAddress) {
            this.physicalAddress = customerAddress.physicalAddress;
            this.postalAddress = customerAddress.postalAddress;
            this.postCode = customerAddress.postCode;
            return this;
        }

        public CustomerAddress build (){

            return new CustomerAddress(this);
        }
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "physicalAddress='" + physicalAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", postCode=" + postCode +
                '}';
    }
// have to come back to update the physical address to maybe an ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAddress customerAddress = (CustomerAddress) o;
        return physicalAddress.equals(customerAddress.physicalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicalAddress);
    }
}
