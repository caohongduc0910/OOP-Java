package J05028;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<DoanhNghiep> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), 
                    Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(v);
        for(DoanhNghiep x : v){
            System.out.println(x);
        }
    }
}
