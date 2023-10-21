package J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("MATHANG.in");
        Scanner sc = new Scanner(text);
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> v = new ArrayList<>();
        while (t-- > 0) {
            v.add(new MatHang(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(v);
        for(MatHang x : v){
            System.out.println(x);
        }
    }
}
