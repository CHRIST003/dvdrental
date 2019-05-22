package ac.za.cput.project.controller.rents;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.factory.rents.RentFactory;
import ac.za.cput.project.service.rents.impl.RentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/rent")
public class RentController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private RentServiceImpl service;

    @GetMapping("/create/{custId}")
    public @ResponseBody
    Rent create(@PathVariable String custId){
        Rent rent = RentFactory.getRent("TY567","C56789","D56","Christ","Nganga","0633073758", 500.00,
                "Thor","Action", 100.00);
        return service.create(rent);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Rent> getAll(){
        return service.getAll();
    }
}