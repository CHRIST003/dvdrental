package ac.za.cput.project.controller.customers;

import ac.za.cput.project.domain.customers.ViewCustomer;
import ac.za.cput.project.factory.customers.ViewCustomerFactory;
import ac.za.cput.project.service.customers.Impl.ViewCustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/view Customer")
public class ViewCustomerController {

    @Autowired
    private ViewCustomerServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    ViewCustomer create(@PathVariable String Name){
        ViewCustomer viewCustomer = ViewCustomerFactory.getViewCustomer("5678", "Christ", "Nganga",
                "633073758",6000);
        return service.create(viewCustomer);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<ViewCustomer> getAll(){
        return service.getAll();
    }
}