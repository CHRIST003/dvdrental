package ac.za.cput.project.service.dvds;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface ViewMovieService extends IService<ViewMovie, String> {

    Set<ViewMovie> getAll();
}

