
package J03026;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.equals(s2)){
                System.out.println("-1");
            }
            else{
                if(s1.length() > s2.length())
                    System.out.println(s1.length());
                else System.out.println(s2.length());
            }
        }
    }
}
