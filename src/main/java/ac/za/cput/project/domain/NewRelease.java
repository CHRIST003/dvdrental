package ac.za.cput.project.domain;

public class NewRelease extends Dvd{


    public NewRelease(int DvdID,String title, double price, boolean availableForRent, String type, String date) {
        super(DvdID,title, price, availableForRent, type, date);
    }

    public void showTypeOfDvd(){
        System.out.println("this is a new release DVD in the market and the price is a bit higher than the old ones");
    }
}
