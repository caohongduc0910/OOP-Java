
package J05020;

import java.util.Comparator;

public class SortByClass implements Comparator <Sinhvien>{

    @Override
    public int compare(Sinhvien o1, Sinhvien o2) {
        if(!o1.getLop().equals(o2.getLop()))
            return o1.getLop().compareTo(o2.getLop());
        else
            return o1.getMa().compareTo(o2.getMa());
    }
    
}
