package Bai_HuongDanDoAn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in"));
        List<SinhVien> v = new ArrayList<>();
        while (sc.hasNext()) {
            v.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA2.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            String tengv = "";
            for (int i = 0; i < a.length - 1; i++) {
                tengv += a[i] + " ";
            }
            int sodetai = Integer.parseInt(a[a.length - 1]);
            while (sodetai-- > 0) {
                String s1 = sc.nextLine();
                String a1[] = s1.split("\\s+");
                String msv = a1[0];
                String tendetai = "";
                for (int i = 1; i < a1.length; i++) {
                    tendetai += a1[i] + " ";
                }
                for (SinhVien x : v) {
                    if (x.getMsv().equals(msv)) {
                        x.setDetai(tendetai);
                        x.setTengv(tengv);
                    }
                }
            }
        }
        Collections.sort(v);
        for (SinhVien x : v) {
            System.out.println(x);
        }
    }
}
