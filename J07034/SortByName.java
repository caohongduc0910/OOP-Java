
package J07034;

import java.util.Comparator;


public class SortByName implements Comparator<MonHoc>{

    @Override
    public int compare(MonHoc o1, MonHoc o2) {
        return o1.getTen().compareTo(o2.getTen());
    }
    
}
