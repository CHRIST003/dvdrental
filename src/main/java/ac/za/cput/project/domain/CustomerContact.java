package ac.za.cput.project.domain;

public class CustomerContact {

    private String phoneNumber;

    private CustomerContact (){

    }

    private CustomerContact(Builder builder){

        this.phoneNumber = builder.phoneNumber;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static class Builder{

        private String phoneNumber;


        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }


        public CustomerContact build(){ return new CustomerContact(this);}


    }

    @Override
    public String toString() {
        return "CustomerContact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
