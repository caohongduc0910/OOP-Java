package Bai_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author CAO DUC
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] cnt1 = new int[10005], cnt2 = new int[10005];
        boolean[] vs = new boolean[10005];
        for (int i = 0; i < 10005; i++) {
            vs[i] = false;
            cnt1[i] = 0;
            cnt2[i] = 0;
        }
        SortedSet<Integer> st = new TreeSet<>();
        SortedSet<Integer> stt = new TreeSet<>();
        try {
            FileInputStream sc = new FileInputStream("DATA1.in");
            ObjectInputStream readStream = new ObjectInputStream(sc);
            ArrayList<Integer> array = (ArrayList<Integer>) readStream.readObject();
            for (Integer it : array) {
                if (check(it)) {
                    st.add(it);
                    cnt1[it]++;
                }
            }
            readStream.close();
            sc.close();
        } catch (ClassNotFoundException e) {

        }

        try {
            FileInputStream sc = new FileInputStream("DATA2.in");
            ObjectInputStream readStream = new ObjectInputStream(sc);
            ArrayList<Integer> array = (ArrayList<Integer>) readStream.readObject();
            for (Integer it : array) {
                if (check(it)) {
                    st.add(it);
                    cnt2[it]++;
                }
            }
            readStream.close();
            sc.close();
        } catch (ClassNotFoundException e) {

        }
        for (Integer it : st) {
            if (!vs[it] && stt.contains(it)) {
                System.out.println(it + " " + cnt1[it] + " " + cnt2[it]);
                vs[it] = true;
            }
        }
    }

    public static boolean check(int n) {
        String s = String.valueOf(n);
        if (s.length() < 2) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
