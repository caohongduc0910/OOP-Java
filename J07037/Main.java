
package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("DN.in");
        Scanner sc = new Scanner(text);
        List <DoanhNghiep> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            v.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v, new SortByID());
        for(DoanhNghiep x : v){
            System.out.println(x);
        }
    }
    
}
