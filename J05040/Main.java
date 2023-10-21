package J05040;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<NhanVien> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), 
                    Integer.parseInt(sc.nextLine()),sc.nextLine()));
        } 
        for(NhanVien x : v){
            System.out.println(x);
        }
    }
}
