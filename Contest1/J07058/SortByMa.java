
package J07058;

import java.util.Comparator;

public class SortByMa implements Comparator<Monhoc>{

    @Override
    public int compare(Monhoc o1, Monhoc o2) {
        return o1.getMa().compareTo(o2.getMa());
    }
}
