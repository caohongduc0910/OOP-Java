/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_LogThoiGian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    
    static boolean check(String s){
        if(s.charAt(2) != ':' || s.charAt(5) != ':')
            return false;
        return !(!Character.isDigit(s.charAt(0)) || !Character.isDigit(s.charAt(1))
                || !Character.isDigit(s.charAt(3)) || !Character.isDigit(s.charAt(4))
                || !Character.isDigit(s.charAt(6)) || !Character.isDigit(s.charAt(7)));
    }

    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in"));

        Scanner sc = new Scanner(System.in); 
        Set <String> se = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.' || s.charAt(i) == ',') {
                    temp += " ";
                } else {
                    temp += s.charAt(i);
                }
            }
            
            String a[] = temp.trim().split("\\s+");
            for (String a1 : a) {
                if(a1.length() >= 7 && check(a1))
                    se.add(a1);
            }  
        }
        for(String x : se){
                System.out.println(x);
            }
    }
}