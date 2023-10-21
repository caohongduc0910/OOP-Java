package J07003;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in");
        Scanner sc = new Scanner(text);
        String s = sc.next();
        if (s.length() == 1) {
            System.out.println(s);
        } else {
            while (s.length() > 1) {
                BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
                BigInteger b = new BigInteger(s.substring(s.length() / 2));
                BigInteger c = a.add(b);
                s = c.toString();
                System.out.println(s);
            }
        }
    }
}
