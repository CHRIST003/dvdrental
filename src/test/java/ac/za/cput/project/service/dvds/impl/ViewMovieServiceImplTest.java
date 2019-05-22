package ac.za.cput.project.service.dvds.impl;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.factory.dvds.ViewMovieFactory;
import ac.za.cput.project.repository.dvds.impl.ViewMovieRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ViewMovieServiceImplTest {

    private ViewMovieRepositoryImpl repository;
    private ViewMovie viewMovie;

    private ViewMovie getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = ViewMovieRepositoryImpl.getRepository();
        this.viewMovie = ViewMovieFactory.getViewMovie("8765","Yamakassi","Action",
                "American",true);
    }

    @Test
    public void getAll() {

        Set<ViewMovie> viewMovies = this.repository.getAll();
        System.out.println("In getall, all = " + viewMovies);
    }

    @Test
    public void create() {

        ViewMovie created = this.repository.create(this.viewMovie);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.viewMovie);
    }

    @Test
    public void update() {

        String newTitle = "Panana";
        ViewMovie updated = new ViewMovie.Builder().copy(getSaved())
                .Title(newTitle)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTitle, updated.getTitle());
    }

    @Test
    public void delete() {

        ViewMovie saved = getSaved();
        this.repository.delete(saved.getDvdID());
        getAll();
    }

    @Test
    public void read() {

        ViewMovie saved = getSaved();
        ViewMovie read = this.repository.read(saved.getDvdID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }
}