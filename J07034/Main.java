
package J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("MONHOC.in");
        Scanner sc = new Scanner(text);
        int t = sc.nextInt();
        sc.nextLine();
        List <MonHoc> v = new ArrayList<>();
        while(t-- > 0){
            v.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v, new SortByName());
        for(MonHoc x : v){
            System.out.println(x);
        }        
    }
    
}
