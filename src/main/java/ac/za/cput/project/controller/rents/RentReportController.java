package ac.za.cput.project.controller.rents;

import ac.za.cput.project.domain.rents.RentReport;
import ac.za.cput.project.factory.rents.RentReportFactory;
import ac.za.cput.project.service.rents.impl.RentReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/rent report")
public class RentReportController {

    @Autowired
    private RentReportServiceImpl service;

    @GetMapping("/create/{CustomerID}")
    public @ResponseBody
    RentReport create(@PathVariable String CustomerID){
        RentReport rentReport = RentReportFactory.getRentReport("TY567","12/12/2011","21/12/2011","3422","4322", 500.00
                );
        return service.create(rentReport);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<RentReport> getAll(){
        return service.getAll();
    }
}
