package ac.za.cput.project.repository;

import ac.za.cput.project.domain.DvdSoldList;

import java.util.Set;

public interface DvdSoldListRepository  extends IRepository<DvdSoldList, String> {

    Set<DvdSoldList>getAll();
}
