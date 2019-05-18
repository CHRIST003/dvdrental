package ac.za.cput.project.repository.categories;

import ac.za.cput.project.domain.categories.Comedy;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface ComedyRepository extends IRepository<Comedy, String> {

    Set<Comedy> getAll();
}
