package ac.za.cput.project.repository.categories;

import ac.za.cput.project.domain.categories.Drama;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface DramaRepository extends IRepository<Drama, String> {

    Set<Drama> getAll();
}
