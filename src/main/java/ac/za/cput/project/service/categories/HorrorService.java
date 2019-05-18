package ac.za.cput.project.service.categories;

import ac.za.cput.project.domain.categories.Horror;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface HorrorService extends IService<Horror, String> {

    Set<Horror> getAll();

}
