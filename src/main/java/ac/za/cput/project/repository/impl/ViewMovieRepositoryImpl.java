package ac.za.cput.project.repository.impl;

import ac.za.cput.project.domain.ViewMovie;
import ac.za.cput.project.repository.ViewMovieRepository;

import java.util.HashSet;
import java.util.Set;

public class ViewMovieRepositoryImpl implements ViewMovieRepository {


    private static ViewMovieRepositoryImpl repository = null;
    private Set<ViewMovie> viewMovies;

    private ViewMovieRepositoryImpl(){
        this.viewMovies = new HashSet<>();
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
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public ViewMovie read(String s) {
        return null;
    }

    @Override
    public Set<ViewMovie> getAll() {
        return this.viewMovies;
    }
}
