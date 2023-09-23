/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<NhanVien> v = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            v.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v, new SortByYear());
        for(NhanVien x : v){
            System.out.println(x);
        }
    }
    
}
