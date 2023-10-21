package J08011;

import java.util.*;

public class Main {
    
    static public boolean check(String s){
        for(int i = 1; i<s.length(); i++){
            if(Character.getNumericValue(s.charAt(i)) < Character.getNumericValue(s.charAt(i-1)))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List <Pair> v = new ArrayList<>();
        Set <String> se = new HashSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                if(se.contains(s)){
                    for(int i = 0; i < v.size(); i++){
                        if(s.equals(v.get(i).getF())){
                            int temp = Integer.parseInt(v.get(i).getL().toString());
                            v.get(i).setL(temp + 1);        
                        }
                    }
                }
                else{
                    v.add(new Pair(s, 1));
                    se.add(s);
                }
            }
        }
        Collections.sort(v);
        for(Pair x : v){
            System.out.println(x);
        }
    }
}
