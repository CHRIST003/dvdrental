package ac.za.cput.project.domain;

public class Members extends Customer {


    public Members(int custID, String name, String lastName, boolean canBuy, boolean canRent, double credit, String type) {
        super(custID, name, lastName, canBuy, canRent, credit, type);
    }

    public void typeOfCustomer(){

        System.out.println(" This customer is a member to the store");
    }
}
