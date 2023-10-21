package J05026;

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
            String[] a = s.toUpperCase().trim().split("\\s+");
            String vt = "";
            for (String x : a) {
                vt += x.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + vt + ":");
            for (GiangVien x : v) {
                if (s.equals(x.getKhoa())) {
                    System.out.println(x);
                }
            }
        }

    }
}
