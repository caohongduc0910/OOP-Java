
package J05021;

import java.util.Comparator;

public class SortByID implements Comparator <Sinhvien>{

    @Override
    public int compare(Sinhvien o1, Sinhvien o2) {
        return o1.getMa().compareTo(o2.getMa());
    }
    
}
