package ac.za.cput.project.controller.useraccess;

import ac.za.cput.project.domain.useraccess.Login;
import ac.za.cput.project.factory.useraccess.LoginFactory;
import ac.za.cput.project.service.useraccess.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/Login")
public class LoginController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private LoginServiceImpl service;

    @GetMapping("/create/{userName}")
    public @ResponseBody
    Login create(@PathVariable String userName){
        Login login = LoginFactory.getLogin("5678","Christ","wise");
        return service.create(login);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Login> getAll(){
        return service.getAll();
    }
}