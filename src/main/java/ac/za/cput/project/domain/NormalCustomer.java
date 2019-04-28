package ac.za.cput.project.domain;

public class NormalCustomer extends Customer{


    public NormalCustomer(int custID, String name, String lastName, boolean canBuy, boolean canRent, double credit, String type) {
        super(custID, name, lastName, canBuy, canRent, credit, type);
    }

    public void typeOfCustomer(){
        System.out.println(" This a normal customer to the store");
    }
}
