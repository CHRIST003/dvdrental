package ac.za.cput.project.repository.sales;

import ac.za.cput.project.domain.sales.DvdSoldList;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface DvdSoldListRepository  extends IRepository<DvdSoldList, String> {

    Set<DvdSoldList>getAll();
}
