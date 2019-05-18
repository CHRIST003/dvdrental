package ac.za.cput.project.controller.dvds;

import ac.za.cput.project.domain.dvds.ViewMovie;
import ac.za.cput.project.factory.dvds.ViewMovieFactory;
import ac.za.cput.project.service.dvds.impl.ViewMovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/view movie")
public class ViewMovieController {

    @Autowired
    private ViewMovieServiceImpl service;

    @GetMapping("/create/{Title}")
    public @ResponseBody
    ViewMovie create(@PathVariable String Title){
        ViewMovie viewMovie = ViewMovieFactory.getViewMovie("5678", "Thor", "Action","Action",
                true);
        return service.create(viewMovie);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<ViewMovie> getAll(){
        return service.getAll();
    }
}
