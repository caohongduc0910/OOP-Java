/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List <MatHang> v = new ArrayList<>();
        while(t-- > 0){
            v.add(new MatHang(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(v, new SortByPrice());
        for(MatHang x : v){
            System.out.println(x);
        }
    }

}
