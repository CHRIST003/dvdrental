package ac.za.cput.project.domain;

public class ViewMovie {

    private String DvdID;
    private String Title;
    private String Category;
    private String type;
    private boolean availability;


    private ViewMovie(){

    }

    private ViewMovie(Builder builder){
        this.DvdID = builder.DvdID;
        this.Title = builder.Title;
        this.Category = builder.Category;
        this.type = builder.type;
        this.availability = builder.availability;
    }


    public String getDvdID() {
        return DvdID;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public static class Builder{

        private String DvdID;
        private String Title;
        private String Category;
        private String type;
        private boolean availability;

        public Builder DvdID(String DvdID){
            this.DvdID = DvdID;
            return this;
        }

        public Builder Title(String Title){
            this.Title = Title;
            return this;
        }

        public Builder Category(String Category){
            this.Category = Category;
            return this;
        }

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder availability(boolean availability){
            this.availability = availability;
            return this;
        }

        public ViewMovie build(){
            return new ViewMovie(this);
        }

    }

    @Override
    public String toString() {
        return "ViewMovie{" +
                "DvdID='" + DvdID + '\'' +
                ", Title='" + Title + '\'' +
                ", Category='" + Category + '\'' +
                ", type='" + type + '\'' +
                ", availability=" + availability +
                '}';
    }
}
