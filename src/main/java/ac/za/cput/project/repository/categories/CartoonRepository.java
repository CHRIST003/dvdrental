package ac.za.cput.project.repository.categories;

import ac.za.cput.project.domain.categories.Cartoon;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface CartoonRepository extends IRepository<Cartoon, String> {

        Set<Cartoon> getAll();
}
