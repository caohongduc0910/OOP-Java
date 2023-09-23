
package J08024;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        Queue<String> q = new ArrayDeque<String>();
        a.add("9");
        q.add("9");
        while(q.peek().length() < 15){
            String s = q.peek();
            q.remove();
            String s1 = s + "0";
            String s2 = s + "9";
            a.add(s1); q.add(s1);
            a.add(s2); q.add(s2);
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(String x : a){
                Long temp = Long.valueOf(x);
                if(temp % n == 0){
                    System.out.println(temp);
                    break;
                }
            } 
        }
    }
}
