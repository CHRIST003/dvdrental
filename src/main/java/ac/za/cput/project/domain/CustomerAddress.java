package ac.za.cput.project.domain;

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

        public CustomerAddress build (){

            return new CustomerAddress(this);
        }
    }
}
