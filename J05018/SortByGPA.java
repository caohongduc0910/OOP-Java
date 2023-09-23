
package J05018;

import java.util.Comparator;


public class SortByGPA implements Comparator<SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if(o1.getDtb() != o2.getDtb())
            if(o1.getDtb() > o2.getDtb())
                return -1;
            else return 1;
        else
            return o1.getId().compareTo(o2.getId());
    }
    
}
