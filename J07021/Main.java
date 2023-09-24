
package J07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("DATA.in");
        Scanner sc = new Scanner(text);
        while(true){
            String s = sc.nextLine();
            if(s.equals("END"))
                break;
            else{
                String[] a = s.trim().split("\\s+");
                String ans = "";
                for(String x : a){
                    ans += x.substring(0,1).toUpperCase() 
                            + x.substring(1).toLowerCase() + " ";
                }
                System.out.println(ans);
            }
        }
    }
}
