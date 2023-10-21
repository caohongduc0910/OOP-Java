
package J07005;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Map <Integer, Integer> mp = new TreeMap<>();
        FileInputStream file = new FileInputStream("DATA.in");
        DataInputStream sc  = new DataInputStream(file);
        List <Integer> v = new ArrayList<>();
        try {
            while(true){
                int x = (int) sc.readInt();
                v.add(x);
            }

        } catch (EOFException ignored) {
        }

        for(int x : v){
            if(mp.containsKey(x)){
                int cnt = mp.get(x);
                cnt++;
                mp.put(x, cnt);
            }
            else{
                mp.put(x, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
