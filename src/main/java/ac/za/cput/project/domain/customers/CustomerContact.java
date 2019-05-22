package ac.za.cput.project.domain.customers;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
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


        public Builder copy(CustomerContact customerContact) {
            this.phoneNumber = customerContact.phoneNumber;
           
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerContact customerContact = (CustomerContact) o;
        return phoneNumber.equals(customerContact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
