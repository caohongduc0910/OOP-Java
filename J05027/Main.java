package J05027;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<GiangVien> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for (GiangVien x : v) {
                if (x.getHoTen().toLowerCase().contains(s.toLowerCase())) {
                    System.out.println(x);
                }
            }
        }

    }
}
