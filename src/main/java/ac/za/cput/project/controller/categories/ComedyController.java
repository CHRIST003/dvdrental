package ac.za.cput.project.controller.categories;

import ac.za.cput.project.domain.categories.Comedy;
import ac.za.cput.project.factory.categories.ComedyFactory;
import ac.za.cput.project.service.categories.impl.ComedyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/comedy")
public class ComedyController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ComedyServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    Comedy create(@PathVariable String Name){
        Comedy comedy = ComedyFactory.getComedy("5678","Christ","Nice movie");
        return service.create(comedy);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Comedy> getAll(){
        return service.getAll();
    }
}
