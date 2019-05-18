package ac.za.cput.project.service.categories;

import ac.za.cput.project.domain.categories.Cartoon;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface CartoonService extends IService<Cartoon, String> {

    Set<Cartoon> getAll();

}
