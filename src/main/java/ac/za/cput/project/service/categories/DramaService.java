package ac.za.cput.project.service.categories;

import ac.za.cput.project.domain.categories.Drama;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface DramaService extends IService<Drama, String> {

    Set<Drama> getAll();

}
