package ac.za.cput.project.controller.customers;

import ac.za.cput.project.domain.customers.Customer;
import ac.za.cput.project.factory.customers.CustomerFactory;
import ac.za.cput.project.service.customers.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/customer")
public class CustomerController {
//
//    @Autowired
//    private CustomerServiceImpl service;
//
////    @GetMapping("/create/{Name}")
////    public @ResponseBody
////    Customer create(@PathVariable String Name){
////        Customer customer = CustomerFactory.getCustomer("633073758");
////        return service.create(customer);
////
////    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Customer> getAll(){
//        return service.getAll();
//    }
}
