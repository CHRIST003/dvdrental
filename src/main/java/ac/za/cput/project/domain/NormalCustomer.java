package ac.za.cput.project.domain;

public class NormalCustomer implements Customer {

    @Override
    public void buyDvd() {

        System.out.println(" As a normal customer Can buy the DVD");
    }

    @Override
    public void rent() {

        System.out.println("As a normal customer Can rent as well ");

    }
}
