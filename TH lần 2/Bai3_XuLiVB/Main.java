package Bai3_XuLiVB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    
    static public boolean check(String s){
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
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
