package J07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {

    private String ma, ten, ns, xh;
    private int tuoi, tong;
    private double d1, d2, thuong;
    public static int cnt = 1;

    public SinhVien(String ten, String ns, double d1, double d2) throws ParseException {
        this.ma = String.format("PH%02d", cnt++);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String temp = sdf.format(sdf.parse(ns));
        this.tuoi = 2021 - Integer.parseInt(temp.substring(6));
        String a[] = ten.trim().split("\\s+");
        this.ten = "";
        for (String x : a) {
            this.ten += x.substring(0, 1).toUpperCase()
                    + x.substring(1).toLowerCase() + " ";
        }
        if (d1 >= 8 && d2 >= 8) {
            this.thuong = 1;
        } else if (d1 >= 7.5 && d2 >= 7.5) {
            this.thuong = 0.5;
        }
        this.d1 = d1;
        this.d2 = d2;
        this.tong = (int) Math.round((d1 + d2) / 2 + this.thuong);
        if(this.tong > 10)
            this.tong = 10;
        if(this.tong >=9)
            this.xh = "Xuat sac";
        else if(this.tong >= 8)
            this.xh = "Gioi";
        else if(this.tong >= 7)
            this.xh = "Kha";
        else if(this.tong >= 5)
            this.xh = "Trung binh";
        else this.xh = "Truot";
        
    }

    @Override
    public String toString() {
        return ma + " " + ten + tuoi + " " + tong + " " + xh; 
    }

}
