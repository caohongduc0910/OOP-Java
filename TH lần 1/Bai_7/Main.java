package Bai_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            if (sc.hasNextLong()) {
                long x = sc.nextLong();
                if(x > 900000000)
                    sum += x;
            } else {
                sc.next();
            }
        }
        System.out.println(sum);
    }
}