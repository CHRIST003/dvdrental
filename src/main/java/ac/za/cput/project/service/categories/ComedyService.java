package ac.za.cput.project.service.categories;

import ac.za.cput.project.domain.categories.Comedy;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface ComedyService extends IService<Comedy, String> {

    Set<Comedy> getAll();

}
