
package J05052;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> v = new ArrayList<>();
        while(t-- > 0){
            v.add(new MatHang(sc.nextLine(), sc.nextLine(),
                    Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        for(MatHang x : v){
            System.out.println(x);
        }
    }
}
