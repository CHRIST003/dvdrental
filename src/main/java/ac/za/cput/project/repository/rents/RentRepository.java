package ac.za.cput.project.repository.rents;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface RentRepository extends IRepository<Rent, String> {

    Set<Rent>getAll();
}
