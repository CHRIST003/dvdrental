package ac.za.cput.project.domain.useraccess;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;


@EntityScan
public class Login {

    private String LoginID;
    private String userName;
    private String password;

    private Login(){

    }

    private Login(Builder builder){

        this.userName = builder.userName;
        this.password = builder.password;
        this.LoginID = builder.LoginID;
    }

    public String getLoginID() {
        return LoginID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{

        private String LoginID;
        private String userName;
        private String password;

        public Builder LoginID (String LoginID){
            this.LoginID = LoginID;
            return this;
        }

        public Builder userName (String userName){
            this.userName = userName;
            return this;
        }

        public Builder password (String password){
            this.password = password;
            return this;
        }

        public Builder copy(Login login) {
            this.LoginID = login.LoginID;
            this.userName = login.userName;
            this.password = login.password;

            return this;
        }

        public Login build(){
            return new Login(this);
        }

    }

    @Override
    public String toString() {
        return "Login{" +
                "LoginID='" + LoginID + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login course = (Login) o;
        return LoginID.equals(course.LoginID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LoginID);
    }
}
