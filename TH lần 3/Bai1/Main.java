
package Bai1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Set<Integer> se1 = new TreeSet<>();
            Set<Integer> se2 = new TreeSet<>();
            for(int i = 0; i<n; i++){
                if(a[i] % 2 == 0){
                    se1.add(a[i]);
                }
                else se2.add(a[i]);
            }
            List<Integer> v = new ArrayList<>();
            for(int x : se2){
                v.add(x);
            }
            Collections.reverse(v);
            for(int x : se1){
                System.out.print(x + " ");
            }
            System.out.println();
            for(int i = 0; i<v.size(); i++){
                System.out.print(v.get(i) + " ");
            }
            System.out.println("");
        }
    }
}

