
package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("MONHOC.in");
        Scanner sc = new Scanner(text);
        List <Monhoc> v = new ArrayList<>();
        Set <String> se = new HashSet<String>();
        while(sc.hasNextLine()){
            Monhoc x = new Monhoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(v.isEmpty()){
                v.add(x);
                se.add(x.getMa());
            }
            else{
                if(!se.contains(x.getMa())){
                    v.add(x);
                    se.add(x.getMa());
                }
            }
        }
        Collections.sort(v, new SortByMa());
        for(Monhoc x : v){
            System.out.println(x);
        }
    }
}
