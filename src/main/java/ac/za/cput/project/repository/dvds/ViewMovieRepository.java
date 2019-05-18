package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface ViewMovieRepository extends IRepository<ViewMovie, String> {

    Set<ViewMovie>getAll();
}
