
package J05018;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List <SinhVien> v = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            v.add(new SinhVien(sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()
            , sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()
            , sc.nextFloat(), sc.nextFloat()));
        }
        Collections.sort(v, new SortByGPA());
        for(SinhVien x : v){
            System.out.println(x);
        }
    }

}
