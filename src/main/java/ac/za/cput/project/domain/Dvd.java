package ac.za.cput.project.domain;


import java.util.Random;

public abstract class  Dvd {

    private int DvdID;
    private String Title;
    private double price;
    private boolean AvailableForRent;
    private String Type;
    private String date;

    public int getDvdID() {
        Random random = new Random();
        DvdID = random.nextInt(89999) + 10000;
        return DvdID;
    }


    public Dvd(int DvdID,String title, double price, boolean availableForRent, String type, String date) {
        DvdID = getDvdID();
        Title = title;
        this.price = price;
        AvailableForRent = availableForRent;
        Type = type;
        this.date = date;
    }



//    public String getTitle() {
//        return Title;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public boolean isAvailableForRent() {
//        return AvailableForRent;
//    }
//
//    public String getType() {
//        return Type;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
   public  void showTypeOfDvd(){

}

    @Override
    public String toString() {
        return "Dvd{" +
                "DvdID='" + DvdID + '\'' +
                ", Title='" + Title + '\'' +
                ", price=" + price +
                ", AvailableForRent=" + AvailableForRent +
                ", Type='" + Type + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
