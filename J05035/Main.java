package J05035;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<SinhVien> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),
            sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            for(SinhVien x : v){
                if(x.getCty().equals(s)){
                    System.out.println(x);
                }
            }            
        }
    }
}
