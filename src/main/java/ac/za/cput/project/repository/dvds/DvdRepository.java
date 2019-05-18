package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.dvds.Dvd;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface DvdRepository extends IRepository<Dvd, String> {

    Set<Dvd> getAll();

}
