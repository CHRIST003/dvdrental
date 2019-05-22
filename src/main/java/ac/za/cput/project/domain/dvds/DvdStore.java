package ac.za.cput.project.domain.dvds;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class DvdStore {


  private String name;
  private String address;

  private DvdStore(){

  }

    private DvdStore(Builder builder){


      this.name = builder.name;
      this.address = builder.address;

    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{


        private String name;
        private String address;


        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder copy(DvdStore dvdStore) {
            this.name = dvdStore.name;
            this.name = dvdStore.address;


            return this;
        }

        public DvdStore build(){
            return new DvdStore(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DvdStore dvdStore = (DvdStore) o;
        return name.equals(dvdStore.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
