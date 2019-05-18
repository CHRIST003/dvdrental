package ac.za.cput.project.domain.dvds;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public abstract class  Dvd {

    private String DvdID;
    private String Title;
    private double price;
    private boolean AvailableForRent;
    private String Type;
    private String date;

    public Dvd(String dvdID, String title, double price, boolean availableForRent, String type, String date) {
        DvdID = dvdID;
        Title = title;
        this.price = price;
        AvailableForRent = availableForRent;
        Type = type;
        this.date = date;
    }



    public Dvd() {
    }

    private Dvd(Builder builder) {
        this.DvdID = builder.DvdID;
        this.AvailableForRent = builder.AvailableForRent;
        this.date = builder.date;
        this.price = builder.price;
        this.Type = builder.Type;
        this.Title = builder.Title;
    }

    public String getDvdID() {
        return DvdID;
    }

    public String getTitle() {
        return Title;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailableForRent() {
        return AvailableForRent;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return Type;
    }

    public static class Builder{

        private String DvdID;
        private String Title;
        private double price;
        private boolean AvailableForRent;
        private String Type;
        private String date;

        public Builder DvdID(String DvdID) {
            this.DvdID = DvdID;
            return this;
        }

        public Builder Title(String Title) {
            this.Title = Title;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder AvailableForRent(boolean AvailableForRent) {
            this.AvailableForRent = AvailableForRent;
            return this;
        }

        public Builder Type(String Type) {
            this.Type = Type;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }



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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Dvd dvd = (Dvd) o;
//        return DvdID.equals(dvd.DvdID);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(DvdID);
//    }

}
