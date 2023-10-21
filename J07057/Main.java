package J07057;

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
            v.add(new ThiSinh(sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(v);   
        for (ThiSinh x : v) {
            System.out.println(x);
        }
    }
}
