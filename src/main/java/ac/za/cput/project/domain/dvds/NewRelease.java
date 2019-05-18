package ac.za.cput.project.domain.dvds;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class NewRelease extends Dvd{

    private String DvdID;
    private String Title;
    private double price;
    private boolean AvailableForRent;
    private String Type;
    private String date;


    private NewRelease(String dvdID, String title, double price, boolean availableForRent, String type, String date, String dvdID1, String title1, double price1, boolean availableForRent1, String type1, String date1) {
        super(dvdID, title, price, availableForRent, type, date);
        DvdID = dvdID1;
        Title = title1;
        this.price = price1;
        AvailableForRent = availableForRent1;
        Type = type1;
        this.date = date1;
    }

    private NewRelease(){

    }

    private NewRelease(Builder builder) {
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

        public Builder copy(NewRelease newRelease){
            this.DvdID = newRelease.DvdID;
            this.Title = newRelease.Title;
            this.price = newRelease.price;
            this.AvailableForRent = newRelease.AvailableForRent;
            this.Type = newRelease.Type;
            this.date = newRelease.date;

            return this;
        }

        public NewRelease build() {
            return new NewRelease(this);
        }

    }

    @Override
    public String toString() {
        return "NewRelease{" +
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
        NewRelease newRelease = (NewRelease) o;
        return DvdID.equals(newRelease.DvdID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DvdID);
    }
}
