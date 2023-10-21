
package DC2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        File text = new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in");
        Scanner sc = new Scanner(text);
        Map <String, Integer> mp = new HashMap<>();
        List<String> v = new ArrayList<>();
        while(sc.hasNextLine()){
            String ten = sc.nextLine();
            ten = ten.toLowerCase();
            String temp = "";
            String[] s = ten.trim().split("\\s+");
            temp += s[s.length-1];
            for(int i = 0; i<s.length-1; i++){
                temp += s[i].charAt(0);
            }
//            System.out.println(temp);
            if(mp.containsKey(temp)){
                int cnt = mp.get(temp);
                cnt++;
                mp.put(temp, cnt);
                temp = temp + cnt;
                v.add(temp);
            }
            else{
                mp.put(temp, 1);
                v.add(temp);
            }
        }
        for(String x : v){
            System.out.println(x);
        }
    }  
}
