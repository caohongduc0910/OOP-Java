
package J03031;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            char[] a = new char[26];
            for(int i = 0; i < s.length(); i++){
                a[s.charAt(i) - 'a']++;
            }
            int cnt = 0;
            for(int i = 0; i<26; i++)
                if(a[i] != 0)
                    cnt++;
            if(26 - cnt <= k)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
