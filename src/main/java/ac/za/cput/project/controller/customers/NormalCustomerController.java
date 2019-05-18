package ac.za.cput.project.controller.customers;

import ac.za.cput.project.domain.customers.NormalCustomer;
import ac.za.cput.project.factory.customers.NormalCustomerFactory;
import ac.za.cput.project.service.customers.Impl.NormalCustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/normal customer")
public class NormalCustomerController {

    @Autowired
    private NormalCustomerServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    NormalCustomer create(@PathVariable String Name){
        NormalCustomer normalCustomer = NormalCustomerFactory.getNormalCustomer("5678", "Christ", "Nganga",
                true, true, 1000, "members");
        return service.create(normalCustomer);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<NormalCustomer> getAll(){
        return service.getAll();
    }
}
