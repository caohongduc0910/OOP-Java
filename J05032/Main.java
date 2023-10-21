package J05032;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Nguoi> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new Nguoi(sc.next(), sc.next()));
        }
        Collections.sort(v);
        int cnt = 0;   
        System.out.println(v.get(v.size()-1).getTen());
        System.out.println(v.get(0).getTen());
    }
}
