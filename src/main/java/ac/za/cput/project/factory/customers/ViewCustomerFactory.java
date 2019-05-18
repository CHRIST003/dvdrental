package ac.za.cput.project.factory.customers;

import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.util.Amr;

public class ViewCustomerFactory {

    public static ViewCustomer getViewCustomer(String CustID, String Name, String LastName,String PhoneNumber, double Credit){
        return new ViewCustomer.Builder().CustID(Amr.generateId())
                .CustID(CustID)
                .Name(Name)
                .LastName(LastName)
                .PhoneNumber(PhoneNumber)
                .Credit(Credit)
                .build();
    }
}

