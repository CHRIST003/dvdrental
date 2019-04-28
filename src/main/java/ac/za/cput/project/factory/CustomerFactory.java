package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Customer;
import ac.za.cput.project.domain.Members;
import ac.za.cput.project.domain.NormalCustomer;

public class CustomerFactory {

   public static Customer CreateCustomer(String type){

       Customer c = null;
       if (type.equalsIgnoreCase("Members")){
           c = new Members(23,"Christ","nganga",true,false,500.00,"Members");
       }else {
           if (type.equalsIgnoreCase("NormalCustomer")){
               c = new NormalCustomer(24,"John","Salumu",true,false,1000.00,"Normal Customer");
           }
       }

       return c;

   }


}
