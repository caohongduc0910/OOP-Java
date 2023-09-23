package J08022;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<Integer>();
            for (int i = 0; i < a.length; i++) {
                if (st.empty()) {
                    st.add(i);
                } else {
                    while (!st.empty() && a[i] > a[st.peek()]) {
                        b[st.peek()] = a[i];
                        st.pop();
                    }
                    st.add(i);
                }
            }
            while (!st.empty()) {
                b[st.peek()] = -1;
                st.pop();
            }
            for (int x : b) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
