package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Admin;
import ac.za.cput.project.domain.ViewMovie;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViewMovieFactoryTest {

    @Test
    public void getViewMovie() {
        ViewMovie a = ViewMovieFactory.getViewMovie("756543546","Thor","Action","old",true);
        System.out.println(a);
        Assert.assertNotNull(a.getDvdID());
    }
}