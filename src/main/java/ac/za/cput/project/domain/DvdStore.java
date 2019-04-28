package ac.za.cput.project.domain;


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
}
