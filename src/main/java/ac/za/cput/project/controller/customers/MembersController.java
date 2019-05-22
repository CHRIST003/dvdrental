package ac.za.cput.project.controller.customers;

import ac.za.cput.project.domain.customers.Members;
import ac.za.cput.project.factory.customers.MembersFactory;
import ac.za.cput.project.service.customers.Impl.MembersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/members")
public class MembersController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MembersServiceImpl service;

    @GetMapping("/create/{Name}")
    public @ResponseBody
    Members create(@PathVariable String Name){
        Members members = MembersFactory.getMembers("5678", "Christ", "Nganga",
                true,true,1000,"members");
        return service.create(members);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Members> getAll(){
        return service.getAll();
    }
}
