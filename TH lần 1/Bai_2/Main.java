package Bai_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DAYSO.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> v = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                v.add(sc.nextInt());
            }
            Collections.sort(v);
            long x1 = 0, x2 = 0;
            for(int i = 0; i<n; i++){
                if(i%2==0)
                    x1 = x1 * 10 + v.get(i);
                else x2 = x2 * 10 + v.get(i);
            }
            System.out.println(x1 + x2);
        }
    }
}
