package ac.za.cput.project.domain.dvds;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;


@EntityScan
public class OldRelease extends Dvd{

    private String DvdID;
    private String Title;
    private double price;
    private boolean AvailableForRent;
    private String Type;
    private String date;


    public OldRelease(String dvdID, String title, double price, boolean availableForRent, String date, String type) {
        super(dvdID, title, price, availableForRent, date, type);

    }

    private OldRelease(){

    }

    private OldRelease(Builder builder) {
        this.DvdID = builder.DvdID;
        this.Title = builder.Title;
        this.AvailableForRent = builder.AvailableForRent;
        this.date = builder.date;
        this.price = builder.price;
        this.Type = builder.Type;
    }

    @Override
    public String getDvdID() {
        return DvdID;
    }

    @Override
    public String getTitle() {
        return Title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isAvailableForRent() {
        return AvailableForRent;
    }

    @Override
    public String getType() {
        return Type;
    }

    @Override
    public String getDate() {
        return date;
    }

    public static class Builder{

        private String DvdID;
        private String Title;
        private double price;
        private boolean AvailableForRent;
        private String Type;
        private String date;

        public OldRelease.Builder DvdID(String DvdID) {
            this.DvdID = DvdID;
            return this;
        }

        public OldRelease.Builder Title(String Title) {
            this.Title = Title;
            return this;
        }
        public OldRelease.Builder price(double price) {
            this.price = price;
            return this;
        }

        public OldRelease.Builder AvailableForRent(boolean AvailableForRent) {
            this.AvailableForRent = AvailableForRent;
            return this;
        }
        public OldRelease.Builder Type(String Type) {
            this.Type = Type;
            return this;
        }

        public OldRelease.Builder date(String date) {
            this.date = date;
            return this;
        }

        public OldRelease.Builder copy(OldRelease oldRelease){
            this.DvdID = oldRelease.DvdID;
            this.Title = oldRelease.Title;
            this.price = oldRelease.price;
            this.AvailableForRent = oldRelease.AvailableForRent;
            this.Type = oldRelease.Type;
            this.date = oldRelease.date;

            return this;
        }

        public OldRelease build() {
            return new OldRelease(this);
        }

    }

    @Override
    public String toString() {
        return "OldRelease{" +
                "DvdID='" + DvdID + '\'' +
                ", Title='" + Title + '\'' +
                ", price=" + price +
                ", AvailableForRent=" + AvailableForRent +
                ", Type='" + Type + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldRelease oldRelease = (OldRelease) o;
        return DvdID.equals(oldRelease.DvdID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DvdID);
    }

}
