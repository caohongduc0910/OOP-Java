
package SoNguyen;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set <Integer> se1 = new HashSet<Integer>();
        Set <Integer> se2 = new HashSet<Integer>();
        for(int i = 0; i<n; i++){
            se1.add(sc.nextInt());
        }
        for(int i = 0; i<m; i++){
            se2.add(sc.nextInt());
        }
        Set<Integer> intersection = new TreeSet<Integer>(se1);
        intersection.retainAll(se2);
        for(int x : intersection){
            System.out.print(x + " ");
        }
        System.out.println("");
        Set<Integer> justse1 = new TreeSet<Integer>(se1);
        justse1.removeAll(se2);
        for(int x : justse1){
            System.out.print(x + " ");
        }
        System.out.println("");
        Set<Integer> justse2 = new TreeSet<Integer>(se2);
        justse2.removeAll(se1);
        for(int x : justse2){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
