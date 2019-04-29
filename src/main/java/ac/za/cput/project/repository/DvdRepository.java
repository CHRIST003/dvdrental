package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Dvd;

import java.util.Set;

public interface DvdRepository extends IRepository<Dvd, String> {

    Set<Dvd> getAll();

}
