
package J05005;

import java.text.ParseException;
import java.util.*;

public class Run {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while(t-- > 0){
            String ten = sc.nextLine();
            String msv = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien x = new SinhVien(ten, msv, dob, gpa);
            list.add(x);
        } 
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o2.getGpa() > o1.getGpa())
                    return 1;
                else return -1;
            }
        });
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
