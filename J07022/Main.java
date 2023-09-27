package J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        List<String> v = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if(check(s)){
                if(s.length() > 10)
                    v.add(s);
            }
            else v.add(s);
        }
        Collections.sort(v);
        for(String x : v){
            System.out.print(x + " ");
        }
    }
}
