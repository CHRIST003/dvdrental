package ac.za.cput.project.repository.dvds.impl;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.repository.dvds.ViewMovieRepository;

import java.util.HashSet;
import java.util.Set;

public class ViewMovieRepositoryImpl implements ViewMovieRepository {


    private static ViewMovieRepositoryImpl repository = null;
    private Set<ViewMovie> viewMovies;

    private ViewMovieRepositoryImpl(){
        this.viewMovies = new HashSet<>();
    }

    private ViewMovie findViewMovie(String DvdID) {
        return this.viewMovies.stream()
                .filter(viewMovie -> viewMovie.getDvdID().trim().equals(DvdID))
                .findAny()
                .orElse(null);
    }

    public static ViewMovieRepositoryImpl getRepository(){

        if(repository == null) repository = new ViewMovieRepositoryImpl();
        return repository;
    }

    @Override
    public ViewMovie create(ViewMovie viewMovie) {
        this.viewMovies.add(viewMovie);
        return viewMovie;
    }

    @Override
    public ViewMovie update(ViewMovie viewMovie) {
        ViewMovie toDelete = findViewMovie(viewMovie.getDvdID());
        if(toDelete != null) {
            this.viewMovies.remove(toDelete);
            return create(viewMovie);
        }
        return null;
    }

    @Override
    public void delete(String DvdID) {

        ViewMovie viewMovie = findViewMovie(DvdID);
        if (viewMovie != null) this.viewMovies.remove(viewMovie);

    }

    @Override
    public ViewMovie read(final String DvdID) {
        ViewMovie viewMovie = findViewMovie(DvdID);
        return viewMovie;
    }

    @Override
    public Set<ViewMovie> getAll() {
        return this.viewMovies;
    }
}
