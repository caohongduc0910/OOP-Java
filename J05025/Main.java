package J05025;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<GiangVien> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v);
        int cnt = 0;
        for(GiangVien x : v){
            System.out.println(x);
        }   
    }
}
