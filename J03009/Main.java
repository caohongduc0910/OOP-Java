
package J03009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            List <String> a1 = Arrays.asList(s1.split("\\s+"));
            List <String> a2 = Arrays.asList(s2.split("\\s+"));
            Set<String> se = new TreeSet<>();
            for(String x : a1){
                if(!a2.contains(x))
                    se.add(x);
            }
            for(String x : se){
                System.out.print(x + ' ');
            }
            System.out.println("");
        }
    }
}
