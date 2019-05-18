package ac.za.cput.project.controller.dvds;

import ac.za.cput.project.domain.dvds.Dvd;
import ac.za.cput.project.factory.dvds.DvdFactory;
import ac.za.cput.project.service.dvds.impl.DvdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/Dvd")
public class DvdController {

//    @Autowired
//    private DvdServiceImpl service;
//
////    @GetMapping("/create/{Title}")
////    public @ResponseBody
////    Dvd create(@PathVariable String Name){
////        Dvd dvd = DvdFactory.getDvd("5678","Christ","Nice movie");
////        return service.create(dvd);
////
////    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Dvd> getAll(){
//        return service.getAll();
//    }
}
