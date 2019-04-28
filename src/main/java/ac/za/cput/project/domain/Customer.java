package ac.za.cput.project.domain;

import java.util.Random;

public abstract class Customer {

    private int CustID;
    private String Name;
    private String LastName;
    private boolean CanBuy;
    private boolean CanRent;
    private double credit;
    private String type;


    private int getCustID(){
        Random random = new Random();
        CustID = random.nextInt(89999) + 10000;
        return CustID;

    }


    public Customer(int custID, String name, String lastName, boolean canBuy, boolean canRent, double credit, String type) {
        CustID = getCustID();
        Name = name;
        LastName = lastName;
        CanBuy = canBuy;
        CanRent = canRent;
        this.credit = credit;
        this.type = type;
    }

    public void typeOfCustomer(){  }

    @Override
    public String toString() {
        return "Customer{" +
                "CustID=" + CustID +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", CanBuy=" + CanBuy +
                ", CanRent=" + CanRent +
                ", credit=" + credit +
                ", type='" + type + '\'' +
                '}';
    }
}
