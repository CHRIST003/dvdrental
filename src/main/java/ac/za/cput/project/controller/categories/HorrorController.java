package ac.za.cput.project.controller.categories;

import ac.za.cput.project.domain.categories.Horror;
import ac.za.cput.project.factory.categories.HorrorFactory;
import ac.za.cput.project.service.categories.impl.HorrorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/horror")
public class HorrorController {

    @Autowired
    private HorrorServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    Horror create(@PathVariable String Name){
        Horror horror = HorrorFactory.getHorror("5678","Christ","Nice movie");
        return service.create(horror);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Horror> getAll(){
        return service.getAll();
    }
}
