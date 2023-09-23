
package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author CAO DUC
 */
public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        ArrayList <MatHang> list = new ArrayList<>();
        while(t-- > 0){
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = Integer.valueOf(sc.nextLine());
            int giaban = Integer.valueOf(sc.nextLine());
            MatHang x = new MatHang(ten, donvi, giamua, giaban);
            list.add(x);
        }
        Collections.sort(list, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getLai() != o2.getLai()){
                    return o2.getLai() - o1.getLai();
                }
                else return o1.getId().compareTo(o2.getId());
            }           
        });
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}
