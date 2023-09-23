package J07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in");
        Scanner sc = new Scanner(text);
        Set <String> se = new TreeSet<>();
        while (sc.hasNext()) {
            String x = sc.next();
            se.add(x.toLowerCase());
        }
        for(String x : se){
            System.out.println(x);
        }
    }
}
