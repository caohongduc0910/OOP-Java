
package J05036;

import static java.lang.Math.round;

public class HangHoa {
    private String ma, ten, donvi;
    private double dongia, soluong, phivc, tong, giaban;
    public static int cnt = 1;

    public HangHoa(String ten, String donvi, double dongia, double soluong) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.donvi = donvi;
        this.dongia = dongia;
        this.soluong = soluong;
        this.phivc = round(dongia * soluong * 0.05);
        this.tong = round(dongia * soluong + this.phivc);
        this.giaban = round(tong * 1.02);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + String.format("%.0f", phivc) 
                + " " + String.format("%.0f", tong) + " " + String.format("%.0f", giaban);
    }
   
}
