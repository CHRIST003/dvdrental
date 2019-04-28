package ac.za.cput.project.domain;

public class Admin {

    private String AdID;
    private String name;
    private String LastName;

    private Admin (){

    }

    private Admin (Builder builder){
        this.AdID = builder.AdID;
        this.name = builder.name;
        this.LastName = builder.LastName;
    }

    public String getAdID() {
        return AdID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public static class Builder{

        private String AdID;
        private String name;
        private String LastName;

        public Builder AdID(String AdID){
            this.AdID = AdID;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder LastName(String LastName){
            this.LastName = LastName;
            return this;
        }

        public Admin build(){
            return new Admin(this);
        }


    }

    @Override
    public String toString() {
        return "Admin{" +
                "AdID='" + AdID + '\'' +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
