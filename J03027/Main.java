package J03027;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if (i == 1) {
                    s = s.substring(i + 1);
                    i--;
                } else if (i == s.length() - 1) {
                    s = s.substring(1, i - 1);
                    i--;
                } else {
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                    i -= 2;
                }
            }
        }
        if(!s.isEmpty())
            System.out.println(s);
        else System.out.println("Empty String");
    }
}
