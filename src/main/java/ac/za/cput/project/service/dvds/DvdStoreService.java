package ac.za.cput.project.service.dvds;

import ac.za.cput.project.domain.dvds.DvdStore;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface DvdStoreService extends IService<DvdStore, String> {

    Set<DvdStore> getAll();
}
