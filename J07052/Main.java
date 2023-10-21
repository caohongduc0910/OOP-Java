package J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("THISINH.in");
        Scanner sc = new Scanner(text);
        int t = Integer.parseInt(sc.nextLine());
        List<ThiSinh> v = new ArrayList<>();
        while (t-- > 0) {
            v.add(new ThiSinh(sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        int n = sc.nextInt();
        Collections.sort(v);
        int dem = 0;
        //double diemxettuyen = 0;
        double diem = 0;
        for (ThiSinh x : v) {
            if (x.getTong() != diem) {
                dem++;
                diem = x.getTong();
                if (dem <= n) {
                    x.setTt("TRUNG TUYEN");
                } else {
                    x.setTt("TRUOT");
                }
            } else {
                if (dem <= n) {
                    x.setTt("TRUNG TUYEN");
                } else {
                    x.setTt("TRUOT");
                }
            }
        }
        System.out.println(String.format("%.1f", diem));
        for (ThiSinh x : v) {
            System.out.println(x);
        }
    }
}
