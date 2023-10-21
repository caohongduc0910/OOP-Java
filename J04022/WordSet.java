package J04022;

import java.util.*;
public class WordSet {
    private Set <String> se = new TreeSet<>();
    
    public WordSet() {
        this.se.clear();
    }

    public WordSet(String s) {
        String a[] = s.toLowerCase().trim().split("\\s+");
        for(String x : a){
            this.se.add(x);
        }
    }
    
    public WordSet union(WordSet o){
        WordSet temp = new WordSet();
        temp.se.addAll(this.se);
        temp.se.addAll(o.se);
        return temp;
    }
    
    public WordSet intersection(WordSet o){
        WordSet temp = new WordSet();
        temp.se.addAll(this.se);
        temp.se.retainAll(o.se);
        return temp;
    }

    @Override
    public String toString() {
        String ans = "";
        for(String x : this.se){
            ans += x + " ";
        }
        return ans;
    }   
}
