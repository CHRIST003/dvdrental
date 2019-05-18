package ac.za.cput.project.controller.dvds;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.factory.dvds.DvdStoreFactory;
import ac.za.cput.project.service.dvds.impl.DvdStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/Dvd Store")
public class DvdStoreController {

    @Autowired
    private DvdStoreServiceImpl service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    DvdStore create(@PathVariable String name){
        DvdStore dvdStore = DvdStoreFactory.getDvdStore("NMCA Movie World","82 rosmead avenue, Kenilworth");
        return service.create(dvdStore);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<DvdStore> getAll(){
        return service.getAll();
    }
}
