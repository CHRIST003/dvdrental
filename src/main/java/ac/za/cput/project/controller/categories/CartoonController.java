package ac.za.cput.project.controller.categories;

import ac.za.cput.project.domain.categories.Cartoon;
import ac.za.cput.project.factory.categories.CartoonFactory;
import ac.za.cput.project.service.categories.impl.CartoonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/cartoon")
public class CartoonController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private CartoonServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    Cartoon create(@PathVariable String Name){
        Cartoon cartoon = CartoonFactory.getCartoon("5678","Christ","Nice movie");
        return service.create(cartoon);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Cartoon> getAll(){
        return service.getAll();
    }
}

