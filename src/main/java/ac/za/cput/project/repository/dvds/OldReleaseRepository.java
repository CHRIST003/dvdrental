package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.dvds.OldRelease;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface OldReleaseRepository extends IRepository<OldRelease, String> {

    Set<OldRelease> getAll();
}
