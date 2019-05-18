package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.dvds.NewRelease;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface NewReleaseRepository extends IRepository<NewRelease, String> {

    Set<NewRelease> getAll();
}
