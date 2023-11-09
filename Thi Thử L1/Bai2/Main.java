
package Bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream sc = new FileInputStream("DATA1.in");
        ObjectInputStream readStream = new ObjectInputStream(sc);
        ArrayList <String> arr1 = (ArrayList<String>) readStream.readObject();
        
        Set <String> se1 = new TreeSet<>();
        Set <Integer> se2 = new TreeSet<>();
        
        for(String x : arr1){
            se1.add(x);
        }
        readStream.close();
        sc.close();
        
        FileInputStream scc = new FileInputStream("DATA2.in");
        ObjectInputStream readStreamm = new ObjectInputStream(scc);
        ArrayList <Integer> arr2 = (ArrayList<Integer>) readStreamm.readObject();
        for(Integer x : arr2){
            se2.add(x);
        }
        readStreamm.close();
        scc.close();
        
        for(String x : se1){
            for(Integer y : se2){
                System.out.println(x + y);
            }
        }
    }
}
