package J05029;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<DoanhNghiep> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(v);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (DoanhNghiep x : v) {
                if (a <= x.getSoluong() && x.getSoluong() <= b) {
                    System.out.println(x);
                }
            }
        }
    }
}
