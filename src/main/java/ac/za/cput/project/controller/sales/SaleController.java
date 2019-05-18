package ac.za.cput.project.controller.sales;

import ac.za.cput.project.domain.sales.Sale;
import ac.za.cput.project.factory.sales.SaleFactory;
import ac.za.cput.project.service.sales.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/sale")
public class SaleController {

    @Autowired
    private SaleServiceImpl service;

    @GetMapping("/create/{CustID}")
    public @ResponseBody
    Sale create(@PathVariable String CustID){
        Sale sale = SaleFactory.getSale("756543546","86756","5456","christ","Nganga",633073758
                ,1000.00,"Thor","Action",200.00);
        return service.create(sale);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Sale> getAll(){
        return service.getAll();
    }
}

