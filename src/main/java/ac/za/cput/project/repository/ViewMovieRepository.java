package ac.za.cput.project.repository;

import ac.za.cput.project.domain.ViewMovie;

import java.util.Set;

public interface ViewMovieRepository extends IRepository<ViewMovie, String> {

    Set<ViewMovie>getAll();
}
