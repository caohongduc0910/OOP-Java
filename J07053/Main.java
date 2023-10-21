package J07053;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File text = new File("XETTUYEN.in");
        Scanner sc = new Scanner(text);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> v = new ArrayList<>();
        while (t-- > 0) {
            v.add(new SinhVien(sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for (SinhVien x : v) {
            System.out.println(x);
        }
    }
}
