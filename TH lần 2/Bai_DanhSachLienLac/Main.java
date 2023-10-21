package Bai_DanhSachLienLac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List <SinhVien> v = new ArrayList<>();
        while(sc.hasNextLine()){
            v.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(v);
        for(SinhVien x : v){
            System.out.println(x);
        }
    }
}
