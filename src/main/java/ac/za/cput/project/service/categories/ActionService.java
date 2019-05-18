package ac.za.cput.project.service.categories;

import ac.za.cput.project.domain.categories.Action;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface ActionService extends IService<Action, String> {

    Set<Action> getAll();

}
