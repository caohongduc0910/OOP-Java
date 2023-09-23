package J02017;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }
        for (int i = 1; i < v.size(); i++) {
            //System.out.println(v.get(i) + " " + v.get(i-1));
            if((v.get(i-1) + v.get(i)) % 2 == 0){
                v.remove(i);
                v.remove(i-1);
                if(i == 1)
                    i--;
                else i -= 2;
            }
        }
        System.out.println(v.size());
    }
}
