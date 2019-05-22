package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.repository.dvds.ViewMovieRepository;
import ac.za.cput.project.repository.dvds.impl.ViewMovieRepositoryImpl;
import ac.za.cput.project.service.dvds.ViewMovieService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class ViewMovieServiceImpl implements ViewMovieService {

    private static ViewMovieServiceImpl service = null;
    private ViewMovieRepository repository;

    private ViewMovieServiceImpl() {
        this.repository = ViewMovieRepositoryImpl.getRepository();
    }

    public static ViewMovieServiceImpl getService(){
        if (service == null) service = new ViewMovieServiceImpl();
        return service;
    }

    @Override
    public Set<ViewMovie> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ViewMovie create(ViewMovie viewMovie) {
        return this.repository.create(viewMovie);
    }

    @Override
    public ViewMovie update(ViewMovie viewMovie) {
        return this.repository.update(viewMovie);
    }

    @Override
    public void delete(String s) {

        this.repository.delete(s);
    }

    @Override
    public ViewMovie read(String s) {
        return this.repository.read(s);
    }
}
