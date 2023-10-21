package J05030;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<SinhVien> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(v);
        int cnt = 0;
        for(SinhVien x : v){
            System.out.print(++cnt + " ");
            System.out.println(x);
        }
        
    }
}
