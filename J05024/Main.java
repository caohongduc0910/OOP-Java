package J05024;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<SinhVien> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            v.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for (int i = 0; i < v.size(); i++) {
                if(s.equals("Ke toan") && 
                        v.get(i).getMa().substring(5,7).equals("KT"))
                    System.out.println(v.get(i));
                else if(s.equals("Cong nghe thong tin") && 
                        !v.get(i).getLop().substring(0,1 ).equals("E") &&
                        v.get(i).getMa().substring(5,7).equals("CN"))
                    System.out.println(v.get(i));
                else if(s.equals("An toan thong tin") &&
                        !v.get(i).getLop().substring(0,1 ).equals("E") &&
                        v.get(i).getMa().substring(5,7).equals("AT"))
                    System.out.println(v.get(i));
                else if(s.equals("Vien thong") && 
                        v.get(i).getMa().substring(5,7).equals("VT"))
                    System.out.println(v.get(i));
                else if(s.equals("Dien tu") && 
                        v.get(i).getMa().substring(5,7).equals("DT"))
                        System.out.println(v.get(i));
            }
        }
    }

}
