/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_SoDep1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {

    static public boolean check(int x) {
        String s = Integer.toString(x);
        if (s.length() < 2) {
            return false;
        } else {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        Set<Integer> se = new TreeSet<>();
        FileInputStream sc = new FileInputStream("DATA1.in");
        ObjectInputStream readStream = new ObjectInputStream(sc);
        List<Integer> v1 = (ArrayList<Integer>) readStream.readObject();
//        Scanner sc = new Scanner(new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in"));
//        List <Integer> v1 = new ArrayList<>();
//        while(sc.hasNext()){
//            v1.add(sc.nextInt());
//        }
        for (int x : v1) {
            if (check(x)) {
                se.add(x);
                if (mp1.containsKey(x)) {
                    int cnt = mp1.get(x) + 1;
                    mp1.put(x, cnt);
                } else {
                    mp1.put(x, 1);
                }
            }
        }
//        sc = new Scanner(new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA2.in"));
//        List <Integer> v2 = new ArrayList<>();
//        while(sc.hasNext()){
//            v2.add(sc.nextInt());
//        }
        sc = new FileInputStream("DATA2.in");
        readStream = new ObjectInputStream(sc);
        List<Integer> v2 = (ArrayList<Integer>) readStream.readObject();
        for (int x : v2) {
            if (check(x)) {
                se.add(x);
                if (mp2.containsKey(x)) {
                    int cnt = mp2.get(x) + 1;
                    mp2.put(x, cnt);
                } else {
                    mp2.put(x, 1);
                }
            }
        }

        for (int x : se) {
            if (mp1.containsKey(x) && mp2.containsKey(x)) {
                System.out.println(x + " " + mp1.get(x) + " " + mp2.get(x));
            }
        }
    }
}
