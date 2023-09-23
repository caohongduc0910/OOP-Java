
package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in");
        Scanner sc = new Scanner(text);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
