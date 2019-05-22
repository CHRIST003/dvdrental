package ac.za.cput.project.controller.categories;


import ac.za.cput.project.domain.categories.Action;
import ac.za.cput.project.factory.categories.ActionFactory;
import ac.za.cput.project.service.categories.impl.ActionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/dvdrental/action")
public class ActionController {


    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ActionServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    Action create(@PathVariable String Name){
        Action action = ActionFactory.getAction("5678","Christ","Nice movie");
        return service.create(action);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Action> getAll(){
        return service.getAll();
    }
}
