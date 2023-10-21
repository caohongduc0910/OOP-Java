
package J07073;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List <MonHoc> v = new ArrayList<>();
        while(t-- > 0){
            v.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), 
                    sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v);
        for(MonHoc x : v){
            if(!x.getTh().equals("Truc tiep"))
                System.out.println(x);
        }
    }
}
