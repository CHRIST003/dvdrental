package ac.za.cput.project.factory.dvds;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.factory.dvds.ViewMovieFactory;
import org.junit.Assert;
import org.junit.Test;

public class ViewMovieFactoryTest {

    @Test
    public void getViewMovie() {
        ViewMovie a = ViewMovieFactory.getViewMovie("756543546","Thor","Action","old",true);
        System.out.println(a);
        Assert.assertNotNull(a.getDvdID());
    }
}