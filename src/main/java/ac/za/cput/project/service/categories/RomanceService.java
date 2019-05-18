package ac.za.cput.project.service.categories;

import ac.za.cput.project.domain.categories.Romance;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface RomanceService extends IService<Romance, String> {

    Set<Romance> getAll();

}
