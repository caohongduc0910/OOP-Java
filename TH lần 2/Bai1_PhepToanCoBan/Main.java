package Bai1_PhepToanCoBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SoNguyen> v = new ArrayList<>();
        while (t-- > 0) {
            v.add(new SoNguyen(sc.nextLine()));
        }

        Collections.sort(v);
        BigInteger ans = new BigInteger("0");
        System.out.println(v.get(0).getA());
        System.out.println(v.get(v.size() - 1).getA());
        for(SoNguyen x : v){
            BigInteger temp = new BigInteger(x.getA().toString());
            ans  = ans.add(temp);
        }
        System.out.println(ans);
    }
}
