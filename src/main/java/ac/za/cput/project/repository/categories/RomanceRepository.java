package ac.za.cput.project.repository.categories;

import ac.za.cput.project.domain.categories.Romance;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface RomanceRepository extends IRepository<Romance, String> {

    Set<Romance> getAll();
}
