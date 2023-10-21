
package J04021;

import java.util.*;

public class IntSet {
    private Set <Integer> se = new TreeSet<>();

    public IntSet(int[] a) {
        for(int x : a){
            se.add(x);
        }
    }
    
    public IntSet union(IntSet o){
        this.se.addAll(o.se);
        return this;
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
