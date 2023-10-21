package J07072;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("DANHSACH.in");
        Scanner sc = new Scanner(text);
        List<Ten> v = new ArrayList<>();
        while (sc.hasNextLine()) {
            v.add(new Ten(sc.nextLine()));
        }
        Collections.sort(v);   
        for (Ten x : v) {
            System.out.println(x);
        }
    }
}
