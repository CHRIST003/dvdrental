package ac.za.cput.project;


import ac.za.cput.project.domain.Dvd;
import ac.za.cput.project.domain.NewRelease;
import ac.za.cput.project.domain.OldRelease;

public class DvdFactory {

    public static Dvd createDvd(String type){

        Dvd dvd = null;

        if (type.equalsIgnoreCase("oldRelease"))
            dvd = new OldRelease(45,"Thor",40.00,true,"Old released movie","21/02/2017");
       else if (type.equalsIgnoreCase("newRelease"))
            dvd = new NewRelease(46,"Avendure",50.00,true,"New released movie","26/04/2019");

        return dvd;
    }
}
