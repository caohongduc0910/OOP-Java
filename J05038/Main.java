package J05038;

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
        int sum = 0;
        for(NhanVien x : v){
            System.out.println(x);
            sum += x.getTong();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
