package J02020;

import java.util.*;

public class Main {

    static int n, k;
    static int[] a = new int[100];
    static boolean ok = true;
    static List<String> v = new ArrayList<>();

    static void khoitao() {
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
    }

    static void sinh() {
        int i = k;
        while (i >= 1 && a[i] == n - k + i) {
            i--;
        }
        if (i == 0) {
            ok = false;
        } else {
            a[i]++;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
    }

    static void in() {
        String s = "";
        for (int i = 1; i <= k; i++) {
            s += a[i] + " ";
        }
        v.add(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        khoitao();
        while (ok) {
            in();
            sinh();
        }
        for (String x : v) {
            System.out.println(x);
        }
        System.out.println("Tong cong co " + v.size() + " to hop");
    }
}
