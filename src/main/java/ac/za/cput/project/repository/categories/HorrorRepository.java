package ac.za.cput.project.repository.categories;

import ac.za.cput.project.domain.categories.Horror;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface HorrorRepository extends IRepository<Horror, String> {

    Set<Horror> getAll();
}
