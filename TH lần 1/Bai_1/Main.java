
package Bai_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int sum = 0;
            List <Character> v = new ArrayList<>();
            for(int i = 0; i<s.length(); i++){
                if(Character.isLetter(s.charAt(i)))
                    v.add(s.charAt(i));
                else
                    sum += Character.getNumericValue(s.charAt(i));
            }
            Collections.sort(v);
            for(char x : v){
                System.out.print(x);
            }
            System.out.println(sum);
        }
    }
}
