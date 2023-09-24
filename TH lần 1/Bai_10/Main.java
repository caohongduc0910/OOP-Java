/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = sc.nextInt();
        List <SinhVien> v = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            v.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
            
        }
        Collections.sort(v, new SortBy());
        for(SinhVien x : v){
            System.out.println(x);
        }
    }
}
