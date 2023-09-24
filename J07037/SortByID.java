
package J07037;

import java.util.Comparator;

public class SortByID implements Comparator<DoanhNghiep>{

    @Override
    public int compare(DoanhNghiep o1, DoanhNghiep o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}
