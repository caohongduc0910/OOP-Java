
package J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String id, ten, msv, dob;
    private double gpa;
    private static int cnt = 1;

    public SinhVien(String ten, String msv, String dob, double gpa) throws ParseException {
        id = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.msv = msv;
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = date.format(date.parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + msv + " " + dob + " " + String.format("%.2f", gpa);
    }   
}
