package ac.za.cput.project.domain.users;


import ac.za.cput.project.domain.sales.DvdSoldList;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
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

            public Builder copy(Admin admin) {
                this.AdID = admin.AdID;
                this.name = admin.name;
                this.LastName = admin.LastName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return AdID.equals(admin.AdID);
    }



    @Override
    public int hashCode() {
        return Objects.hash(AdID);
    }
}
