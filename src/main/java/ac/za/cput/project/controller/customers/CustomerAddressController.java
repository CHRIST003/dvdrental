package ac.za.cput.project.controller.customers;

import ac.za.cput.project.domain.customers.CustomerAddress;
import ac.za.cput.project.factory.customers.CustomerAddressFactory;
import ac.za.cput.project.service.customers.Impl.CustomerAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/customer address")
public class CustomerAddressController {

    @Autowired
    private CustomerAddressServiceImpl service;

    @GetMapping("/create/{physicalAddress}")
    public @ResponseBody
    CustomerAddress create(@PathVariable String physicalAddress){
        CustomerAddress customerAddress = CustomerAddressFactory.getCustomerAddress("82 rosmead avenue",
                "82 rosmead avenue",7708);
        return service.create(customerAddress);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<CustomerAddress> getAll(){
        return service.getAll();
    }
}

