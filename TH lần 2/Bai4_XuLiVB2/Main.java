package Bai4_XuLiVB2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    
    static public boolean check(String s){
        boolean ok1 = false, ok2 = false;
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                ok1 = true;
            if(s.charAt(i) == '.' || s.charAt(i) == ',' ||s.charAt(i) == '?' ||
                    s.charAt(i) == ':' ||
                    s.charAt(i) == '!')
                ok2 = true;
        }
        if(ok1 && !ok2)
            return true;
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set <String> se = new TreeSet<>();
        while(sc.hasNext()){
            String x = sc.next();
            if(check(x)){
                se.add(x);
            }
        }
        for(String x : se){
            System.out.println(x);
        }
    }
}
