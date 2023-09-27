package J02037;

import java.util.*;

public class Main {

    static boolean check(String a[], int n) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < a.length; i++) {
            if(Integer.parseInt(a[i]) % 2 == 0)
                c1++;
            else
                c2++;
        }
        if(c1 > c2 && n % 2 == 0)
            return true;
        if(c2 > c1 && n % 2 == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            if(check(a, a.length))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
