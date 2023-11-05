package Bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Register> v1 = new ArrayList<>();
        List<Institution> v2 = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            //String a[] = s.split("\\s+");
            String maTruong = st.nextToken();
            String tenTruong = "";
            while(st.hasMoreTokens()){
                tenTruong += st.nextToken() + " ";
            }
            v2.add(new Institution(maTruong, tenTruong));
        }
        sc = new Scanner(new File("REGISTER.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            String maTruong = a[0];
            int q = Integer.parseInt(a[1]);
            while(q-- > 0){
                String tenDoi = sc.nextLine();
                for(Institution x : v2){
                    if(x.getMaTruong().equals(maTruong)){
                        v1.add(new Register(x, tenDoi));
                    }
                }
            }
        }
        int cnt = 1;
        Collections.sort(v1);
        for (Register x : v1) {
            String stt = "team" + String.format("%02d", cnt++);
            System.out.print(stt + " ");
            System.out.println(x);
        }
    }
}
