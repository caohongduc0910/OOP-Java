
package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("MONHOC.in");
        Scanner sc = new Scanner(text);
        List <Monhoc> v = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            v.add(new Monhoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v, new SortByMa());
        for(Monhoc x : v){
            System.out.println(x);
        }
    }
}
