package ac.za.cput.project.repository.categories;

import ac.za.cput.project.domain.categories.Action;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface ActionRepository extends IRepository<Action, String> {

        Set<Action> getAll();
}
