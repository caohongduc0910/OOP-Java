
package J07009;

import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private Set<Integer> se = new TreeSet<>();

    public IntSet() {
    }

    public IntSet(int a[]) {
        for(int x : a){
            this.se.add(x);
        }
    }
    
    public IntSet intersection(IntSet o){
        IntSet temp = new IntSet();
        temp.se.addAll(this.se);
        temp.se.retainAll(o.se);
        return temp;
    }

    @Override
    public String toString() {
        String ans = "";
        for(int x : this.se){
            ans += x + " ";
        }
        return ans;
    }
  
}
