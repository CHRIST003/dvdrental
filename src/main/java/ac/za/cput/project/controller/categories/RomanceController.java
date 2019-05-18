package ac.za.cput.project.controller.categories;

import ac.za.cput.project.domain.categories.Romance;
import ac.za.cput.project.factory.categories.RomanceFactory;
import ac.za.cput.project.service.categories.impl.RomanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/romance")
public class RomanceController {

    @Autowired
    private RomanceServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    Romance create(@PathVariable String Name){
        Romance romance = RomanceFactory.getRomance("5678", "Christ", "Nice movie");
        return service.create(romance);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Romance> getAll(){
        return service.getAll();
    }
}

