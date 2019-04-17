package ac.za.cput.project.domain;



public class Dvd {

    private String DvdId;
    private String  title;
    private double price;
    private boolean AvailableForRent;

    private Dvd(){ }

    private Dvd(Builder builder) {

        this.DvdId = builder.DvdId;
        this.title = builder.title;
        this.price = builder.price;
        this.AvailableForRent = builder.AvailableForRent;
    }

    public String getDvdId() {
        return DvdId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailableForRent() {
        return AvailableForRent;
    }

    public static class Builder{
        private String DvdId;
        private String  title;
        private double price;
        private boolean AvailableForRent;


        public Builder DvdId(String DvdId){
          this.DvdId = DvdId;
          return this;
        }

        public Builder title(String title){
            this.DvdId = title;
            return this;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder AvailableForRent(boolean AvailableForRent){
            this.AvailableForRent = AvailableForRent;
            return this;
        }

        public Dvd build() {
            return new Dvd(this);
        }
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "DvdId='" + DvdId + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", AvailableForRent=" + AvailableForRent +
                '}';
    }
}
