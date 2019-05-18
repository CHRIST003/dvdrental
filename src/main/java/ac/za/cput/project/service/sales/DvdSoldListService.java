package ac.za.cput.project.service.sales;

import ac.za.cput.project.domain.sales.DvdSoldList;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface DvdSoldListService extends IService<DvdSoldList, String> {

    Set<DvdSoldList> getAll();
}
