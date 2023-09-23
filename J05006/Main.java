
package J05006;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(NhanVien x : list){
            System.out.println(x);
        }
    }
}
