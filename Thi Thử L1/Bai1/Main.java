
package Bai1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    
    public static boolean check(String s){
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!' 
                    || s.charAt(i) == '?' || s.charAt(i) == ':')
                return false;
            if(Character.isDigit(s.charAt(i)))
                cnt++;
        }
        if(cnt > 0)
            return true;
        return false;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set <String> se = new TreeSet<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim();
            String a[] = s.split("\\s+");
            for(int i = 0; i < a.length; i++){
                se.add(a[i]);
            }
        }
        for(String x : se){
            if(check(x))
                System.out.println(x);
        }
    }
}
