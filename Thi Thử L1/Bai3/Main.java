
package Bai3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List <SanPham> v = new ArrayList<>();
        while(t-- > 0){
            v.add(new SanPham(sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(v);
        for(SanPham x : v){
            System.out.println(x);
        }
    }
}
