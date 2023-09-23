
package J05011;

import java.util.Comparator;

public class SortByTime implements Comparator <Gamer>{

    @Override
    public int compare(Gamer o1, Gamer o2) {
        String s1 = o1.Gettime();
        String s2 = o2.Gettime();
        if(o1.getGio() != o2.getGio())
            return o2.getGio() - o1.getGio();
        else{
            return o2.getPhut() - o2.getPhut();
        }
    }
    
}
