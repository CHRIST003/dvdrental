package ac.za.cput.project.domain;

public class Members implements Customer {

    @Override
    public void buyDvd() {

        System.out.println("As a member I can buy a dvd");
    }

    @Override
    public void rent() {

        System.out.println("As a member I can rent a dvd");

    }
}
