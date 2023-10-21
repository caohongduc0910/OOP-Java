package J07059;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("CATHI.in");
        Scanner sc = new Scanner(text);
        int t = Integer.parseInt(sc.nextLine());
        List<CaThi> v = new ArrayList<>();
        while (t-- > 0) {
            v.add(new CaThi(sc.nextLine(), sc.nextLine(),
                    sc.nextLine()));
        }
        Collections.sort(v);
        for (CaThi x : v) {
            System.out.println(x);
        }
    }
}
