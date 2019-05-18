package ac.za.cput.project.service.dvds;

import ac.za.cput.project.domain.dvds.Dvd;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface DvdService  extends IService<Dvd, String> {

    Set<Dvd> getAll();
}
