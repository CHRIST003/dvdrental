package ac.za.cput.project.controller.sales;

import ac.za.cput.project.domain.sales.SaleReport;
import ac.za.cput.project.factory.sales.SaleReportFactory;
import ac.za.cput.project.service.sales.impl.SaleReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/sale report")
public class SaleReportController {

    @Autowired
    private SaleReportServiceImpl service;

    @GetMapping("/create/{CustName}")
    public @ResponseBody
    SaleReport create(@PathVariable String CustName){
        SaleReport saleReport = SaleReportFactory.getSaleReport("756543546","22/04/2019","8756","Christ","9867567"
                ,5678,500.00);
        return service.create(saleReport);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<SaleReport> getAll(){
        return service.getAll();
    }
}
