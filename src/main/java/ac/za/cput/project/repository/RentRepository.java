package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Rent;

import java.util.Set;

public interface RentRepository extends IRepository<Rent, String> {

    Set<Rent>getAll();
}
