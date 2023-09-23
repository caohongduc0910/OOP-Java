/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ThiSinh> v = new ArrayList<>();
        List<ThiSinh> ans = new ArrayList<>();
        double maxx = 0;
        while (t-- > 0) {
            v.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                     Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for (ThiSinh x : v) {
            maxx = Math.max(maxx, x.getGpa());
        }
        for (ThiSinh x : v) {
            if (x.getGpa() == maxx) {
                ans.add(x);
            }
        }
        Collections.sort(ans, new SortByGPA());
        for (ThiSinh x : ans) {
            System.out.println(x);
        }
    }

}
