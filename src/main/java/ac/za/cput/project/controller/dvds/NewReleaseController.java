package ac.za.cput.project.controller.dvds;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.factory.dvds.NewReleaseFactory;
import ac.za.cput.project.service.dvds.impl.NewReleaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/new release")
public class NewReleaseController {

    @Autowired
    private NewReleaseServiceImpl service;

    @GetMapping("/create/{Title}")
    public @ResponseBody
    NewRelease create(@PathVariable String Title){
        NewRelease newRelease = NewReleaseFactory.getNewRelease("5678", "Thor", 500,true,
                "Action","12/02/2018");
        return service.create(newRelease);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<NewRelease> getAll(){
        return service.getAll();
    }
}
