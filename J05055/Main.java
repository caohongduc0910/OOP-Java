package J05055;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<VanDV> v = new ArrayList<>();
        while (t-- > 0) {
            v.add(new VanDV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        List<Long> a = new ArrayList<>();
        for (VanDV x : v) {
            if (!a.contains(x.getTtxephang())) {
                a.add(x.getTtxephang());
            }
        }
        Collections.sort(a);
        int cnt = 1;
        int cur = cnt;

        for (long k : a) {
            for (VanDV x : v) {
                if(x.getTtxephang() == k){
                    x.setXh(cur);
                    cnt++;
                }
            }
            cur = cnt;
        }
        
        for(VanDV x : v){
            System.out.println(x);
        }
    }
}
