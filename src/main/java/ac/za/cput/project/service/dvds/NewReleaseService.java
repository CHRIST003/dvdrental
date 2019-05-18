package ac.za.cput.project.service.dvds;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface NewReleaseService extends IService<NewRelease, String> {

    Set<NewRelease> getAll();
}
