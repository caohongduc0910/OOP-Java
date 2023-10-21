
package J07006;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Map <Integer, Integer> mp = new TreeMap<>();
        FileInputStream sc = new FileInputStream("DATA.in");
        ObjectInputStream readStream  = new ObjectInputStream(sc);
        ArrayList<Integer> v = (ArrayList<Integer>) readStream.readObject();
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
