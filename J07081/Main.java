package J07081;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File text = new File("SINHVIEN.in");
        Scanner sc = new Scanner(text);

        List<SinhVien> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }      
        Collections.sort(v);
        for (SinhVien x : v) {
            System.out.println(x);
        }
    }
}
