package ac.za.cput.project.controller.users;

import ac.za.cput.project.domain.users.Admin;
import ac.za.cput.project.factory.users.AdminFactory;
import ac.za.cput.project.service.users.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/admin")
public class AdminController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private AdminServiceImpl service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Admin create(@PathVariable String name){
        Admin admin = AdminFactory.getAdmin("5678", "Christ", "Nganga");
        return service.create(admin);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Admin> getAll(){
        return service.getAll();
    }
}
