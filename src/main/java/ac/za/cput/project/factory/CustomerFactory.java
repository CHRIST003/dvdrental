package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Customer;
import ac.za.cput.project.domain.Members;
import ac.za.cput.project.domain.NormalCustomer;

public class CustomerFactory {

   public static Customer CreateCustomer(String typeOfCustomer){

       Customer c = null;
       if (typeOfCustomer.equals("Members")){
           c = new Members();
       }else {
           if (typeOfCustomer.equals("NormalCustomer")){
               c = new NormalCustomer();
           }
       }

       return c;

   }


}
