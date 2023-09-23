
package J05020;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List <Sinhvien> v = new ArrayList<>();
        sc.nextLine();
        while(t-- > 0){
            v.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v, new SortByClass());
        for(Sinhvien x : v){
            System.out.println(x);
        }
    }

}
