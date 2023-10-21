/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_LopUser;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = Integer.parseInt(sc.nextLine());
        List <User> v = new ArrayList<>();
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            v.add(new User(a[0], a[1]));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            for(User x : v){
                if(x.getUsername().equals(a[0]) && x.getPassword().equals(a[1])){
                    int cnt = x.getThanhcong() + 1;
                    x.setThanhcong(cnt);
                }
            }
        }
        for(User x : v){
            System.out.print(x);
        }
    }
}