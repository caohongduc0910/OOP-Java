package J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("DATA.in");
        Scanner sc = new Scanner(text);
        int a[] = new int[1000];
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            a[x]++;
        }
        for (int i = 0; i < 1000; i++) {
            if(a[i] != 0)
                System.out.println(i + " " + a[i]);
        }
    }
}
