package ac.za.cput.project.factory.dvds;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.util.Amr;

public class ViewMovieFactory {

    public static ViewMovie getViewMovie(String DvdID, String Title, String Category, String type, boolean availability){
        return new ViewMovie.Builder().DvdID(Amr.generateId())
                .DvdID(DvdID)
                .Title(Title)
                .Category(Category)
                .type(type)
                .availability(availability)
                .build();
    }
}
