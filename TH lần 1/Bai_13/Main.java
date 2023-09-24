
package Bai_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        List <MonHoc> v = new ArrayList<>();
        //Set <MonHoc> se = new HashSet<>();
        while(sc.hasNext()){
            MonHoc mh = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(v.isEmpty())
                v.add(mh);
            else{
                boolean ok = true;
                for(MonHoc x : v){
                    if(mh.getMa().equals(x.getMa()))
                        ok = false;
                }
                if(ok)
                    v.add(mh);
            }
                
        }
        Collections.sort(v, new SortByID());
        for(MonHoc x : v){
            System.out.println(x);
        }
    }
}
