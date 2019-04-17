package ac.za.cput.project.factory;

import ac.za.cput.project.domain.Dvd;
import ac.za.cput.project.util.Amr;

public class DvdFactory {

    public static Dvd getDvd(String title, double price, boolean AvailableForRent){
          return new Dvd.Builder().DvdId(Amr.generateId())
                  .title(title)
                  .price(price)
                  .AvailableForRent(AvailableForRent)
                  .build();
    }
}
