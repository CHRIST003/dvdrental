package ac.za.cput.project.factory.customers;

import ac.za.cput.project.domain.customers.NormalCustomer;
import ac.za.cput.project.util.Amr;

public class NormalCustomerFactory {

    public static NormalCustomer getNormalCustomer(String CustID, String Name, String LastName, boolean CanBuy, boolean CanRent, double credit, String type){
        return new NormalCustomer.Builder().CustID(Amr.generateId())
                .CustID(CustID)
                .Name(Name)
                .LastName(LastName)
                .CanBuy(CanBuy)
                .CanRent(CanRent)
                .credit(credit)
                .type(type)
                .build();

    }
}
