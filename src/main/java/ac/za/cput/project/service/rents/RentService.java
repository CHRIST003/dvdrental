package ac.za.cput.project.service.rents;

import ac.za.cput.project.domain.rents.Rent;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface RentService extends IService<Rent, String> {

    Set<Rent> getAll();
}
