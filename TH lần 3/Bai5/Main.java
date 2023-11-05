package Bai5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a[] = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.next();
            }
            Stack<Long> st = new Stack<>();
            for(int i = a.length - 1; i >=0; i--){
                if("+".equals(a[i])){
                    Long d1 = st.peek();
                    st.pop();
                    Long d2 = st.peek();
                    st.pop();
                    Long d3 = d1 + d2;
                    st.push(d3);
                }
                else if("-".equals(a[i])){
                    Long d1 = st.peek();
                    st.pop();
                    Long d2 = st.peek();
                    st.pop();
                    Long d3 = d1 - d2;
                    st.push(d3);
                }
                else if("*".equals(a[i])){
                    Long d1 = st.peek();
                    st.pop();
                    Long d2 = st.peek();
                    st.pop();
                    Long d3 = d1 * d2;
                    st.push(d3);
                }
                else if("/".equals(a[i])){
                    Long d1 = st.peek();
                    st.pop();
                    Long d2 = st.peek();
                    st.pop();
                    Long d3 = d1 / d2;
                    st.push(d3);
                }
                else{
                    st.push(Long.valueOf(a[i]));
                }
            }
            System.out.println(st.peek());
        }
    }
}
