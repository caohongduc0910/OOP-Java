package JKT013;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<String> a = new ArrayList<>();
            Queue<String> q = new ArrayDeque<String>();
            a.add("6");
            a.add("8");
            q.add("6");
            q.add("8");
            while (q.peek().length() < n) {
                String s = q.peek();
                q.remove();
                String s1 = s + "6";
                String s2 = s + "8";
                a.add(s1);
                q.add(s1);
                a.add(s2);
                q.add(s2);
            }
            System.out.println(a.size());
            for (int i = a.size() - 1; i >= 0; i--) {
                System.out.print(a.get(i) + " ");
            }
            System.out.println("");
        }
    }
}
