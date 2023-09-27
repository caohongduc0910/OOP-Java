
package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String id, ten, lop, ns, gpa;
    private static int cnt = 1;
    
    public SinhVien(String ten, String lop, String ns, double gpa) throws ParseException {
        this.id = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.ns = date.format(date.parse(ns));
        this.gpa = String.format("%.2f", gpa);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + ns + " " + gpa;
    }
    
}
