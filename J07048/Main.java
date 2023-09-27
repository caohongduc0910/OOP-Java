
package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            ds.add(new SanPham(sc.nextLine(), sc.nextLine(), 
                    Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        for(SanPham tmp : ds){
            System.out.println(tmp);
        }
    }
}
