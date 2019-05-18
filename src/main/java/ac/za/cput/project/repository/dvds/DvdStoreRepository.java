package ac.za.cput.project.repository.dvds;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface DvdStoreRepository extends IRepository<DvdStore, String> {

    Set<DvdStore>getAll();
}
