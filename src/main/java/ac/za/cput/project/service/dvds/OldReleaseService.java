package ac.za.cput.project.service.dvds;

import ac.za.cput.project.domain.dvds.OldRelease;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface OldReleaseService extends IService<OldRelease, String> {

    Set<OldRelease> getAll();
}
