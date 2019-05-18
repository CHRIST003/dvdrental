package ac.za.cput.project.controller.customers;

import ac.za.cput.project.domain.customers.CustomerContact;
import ac.za.cput.project.factory.customers.CustomerContactFactory;
import ac.za.cput.project.service.customers.Impl.CustomerContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/customer contact")
public class CustomerContactController {

    @Autowired
    private CustomerContactServiceImpl service;

    @GetMapping("/create/{phoneNumber}")
    public @ResponseBody
    CustomerContact create(@PathVariable String phoneNumber){
        CustomerContact customerContact = CustomerContactFactory.getCustomerContact("633073758");
        return service.create(customerContact);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<CustomerContact> getAll(){
        return service.getAll();
    }
}
