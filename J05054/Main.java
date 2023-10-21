
package J05054;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List <HocSinh> v = new ArrayList<>();
        Set <Double> se = new TreeSet<>();
        while(t-- > 0){
            v.add(new HocSinh(sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        
        for(int i = 0; i<v.size(); i++){
            se.add(v.get(i).getGpa());
        }
        
        List <Double> a = new ArrayList<>(se);    
        
        Collections.reverse(a);
        
        int cnt = 1;
        int cur = cnt;
        
        for(double x : a){
            for(int i = 0; i<v.size(); i++){
                if(v.get(i).getGpa() == x){
                    v.get(i).setXh(cur);
                    cnt++;
                }
            }
            cur = cnt;
        }
        
        for(HocSinh x : v){
            System.out.println(x);
        }
       
    }
}
