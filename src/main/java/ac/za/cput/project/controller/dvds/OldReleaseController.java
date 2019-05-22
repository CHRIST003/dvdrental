package ac.za.cput.project.controller.dvds;

import ac.za.cput.project.domain.dvds.OldRelease;
import ac.za.cput.project.factory.dvds.OldReleaseFactory;
import ac.za.cput.project.service.dvds.impl.OldReleaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/old release")
public class OldReleaseController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private OldReleaseServiceImpl service;

    @GetMapping("/create/{Title}")
    public @ResponseBody
    OldRelease create(@PathVariable String Title){
        OldRelease oldRelease = OldReleaseFactory.getOldRelease("5678", "Thor", 500,true,
                "Action","12/02/2018");
        return service.create(oldRelease);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<OldRelease> getAll(){
        return service.getAll();
    }
}
