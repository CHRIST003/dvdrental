package ac.za.cput.project.controller.categories;

import ac.za.cput.project.domain.categories.Category;
import ac.za.cput.project.service.categories.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/dvdrental/category")
public class CategoryController {
//
//    @Autowired
//    private CategoryServiceImpl service;
//
////    @GetMapping("/create/{Name}")
////    public @ResponseBody
////    Category create(@PathVariable String Name){
//////   Category category = CategoryFactory.getCategory("5678","Christ","Nice movie");
//////        return service.create(action);
//
//    //As A super class, I will come back to it and figure out what to implement
////
////    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Category> getAll(){
//        return service.getAll();
//    }
}

