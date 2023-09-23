
package J07002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in");
        Scanner sc = new Scanner(text);
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                if(s.length() <= 10){
                sum += Integer.parseInt(s);
                }
            }catch(NumberFormatException exception){
                
            }
        }
        System.out.println(sum);
    }
}
