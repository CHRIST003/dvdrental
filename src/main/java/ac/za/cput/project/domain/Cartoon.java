package ac.za.cput.project.domain;

public class Cartoon implements Category {
    @Override
    public void canBe() {
        System.out.println("Cartoon");
    }
}
