package ac.za.cput.project.controller.sales;

import ac.za.cput.project.domain.sales.DvdSoldList;
import ac.za.cput.project.factory.sales.DvdSoldListFactory;
import ac.za.cput.project.service.sales.impl.DvdSoldListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/dvd sold list")
public class DvdSoldListController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private DvdSoldListServiceImpl service;

    @GetMapping("/create/{QtyOfDvd}")
    public @ResponseBody
    DvdSoldList create(@PathVariable int QtyOfDvd){
        DvdSoldList dvdSoldList = DvdSoldListFactory.getDvdSoldList("5678", 5, 500);
        return service.create(dvdSoldList);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<DvdSoldList> getAll(){
        return service.getAll();
    }
}
