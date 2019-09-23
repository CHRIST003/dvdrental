package ac.za.cput.project.factory.customers;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.util.Amr;

public class MembersFactory {

        public static Members getMembers(String Name, String LastName, boolean CanBuy,boolean CanRent,double credit,String type){
            return new Members.Builder().CustID(Amr.generateId())

                    .Name(Name)
                    .LastName(LastName)
                    .CanBuy(CanBuy)
                    .CanRent(CanRent)
                    .credit(credit)
                    .type(type)
                    .build();

        }
}

