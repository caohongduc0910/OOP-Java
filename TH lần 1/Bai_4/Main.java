
package Bai_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        Set <String> se1 = new TreeSet<>();
        Set <String> se2 = new TreeSet<>();
        Set <String> se3 = new TreeSet<>();
        Set <String> se4 = new TreeSet<>();
        while(n1-- > 0){
            String a[] = (sc.nextLine().trim().toLowerCase().split("\\s+"));
            for(int i = 0; i < a.length; i++){
                se1.add(a[i]);
                se3.add(a[i]);
            }
        }
        int n2 = Integer.parseInt(sc.nextLine());
        while(n2-- > 0){
            String a[] = (sc.nextLine().trim().toLowerCase().split("\\s+"));
            for(int i = 0; i < a.length; i++){
                se2.add(a[i]);
                se4.add(a[i]);
            }
        }
        se1.removeAll(se2);
        for(String x : se1){
            System.out.print(x + " ");
        }
        System.out.println("");
        se4.removeAll(se3);
        for(String x : se4){
            System.out.print(x + " ");
        }
    }
}
