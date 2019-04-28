package ac.za.cput.project.domain;

public class OldRelease extends Dvd {

    public OldRelease(int DvdID,String title, double price, boolean availableForRent, String type, String date) {
        super(DvdID,title, price, availableForRent, type, date);
    }

    public void showTypeOfDvd(){
        System.out.println("this is an old release DVD in the market and the price is less expensive than the new ones");
    }
}
