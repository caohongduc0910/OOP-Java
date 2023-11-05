
package Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private String d1, d2;
    private long tgOnline;

    public SinhVien(String ten, String d1, String d2) throws ParseException{
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date startDate = (Date) sdf.parse(d1);
        Date endDate = (Date) sdf.parse(d2);
        this.tgOnline = (long) endDate.getTime() - startDate.getTime();
        this.tgOnline = (long) (this.tgOnline/(60 * 1000));
    }

    @Override
    public String toString() {
        return  ten + " " + tgOnline;
    }

    @Override
    public int compareTo(SinhVien o) {
        return (int) (o.tgOnline - this.tgOnline);
    }
  
}
