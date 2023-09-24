
package Bai_13;

import java.util.Comparator;

public class SortByID implements Comparator<MonHoc>{

    @Override
    public int compare(MonHoc o1, MonHoc o2) {
        return o1.getMa().compareTo(o2.getMa());
    }
    
}
