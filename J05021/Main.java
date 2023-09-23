
package J05021;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <Sinhvien> v = new ArrayList<>();
        while(sc.hasNext()){
            v.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v, new SortByID());
        for(Sinhvien x : v){
            System.out.println(x);
        }
    }

}
