package ac.za.cput.project.repository;

import ac.za.cput.project.domain.DvdStore;

import java.util.Set;

public interface DvdStoreRepository extends IRepository<DvdStore, String>{

    Set<DvdStore>getAll();
}
