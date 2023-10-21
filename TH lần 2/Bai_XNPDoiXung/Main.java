/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_XNPDoiXung;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<String> v = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.add("0");
            q.add("1");
            v.add("0");
            v.add("1");
            while (q.peek().length() < (n / 2)) {
                String temp = q.poll();
                String temp1 = temp + "0";
                String temp2 = temp + "1";
                q.add(temp1);
                q.add(temp2);
                v.add(temp1);
                v.add(temp2);
            }
            for (String x : v) {
                String temp = "";
                for (int i = x.length() - 1; i >= 0; i--) {
                    temp += x.charAt(i);
                }
                System.out.print(x + temp + " ");
            }
            System.out.println("");
        }

    }
}
