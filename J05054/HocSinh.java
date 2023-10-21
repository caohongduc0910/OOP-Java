
package J05054;

public class HocSinh implements Comparable<HocSinh>{
    private String ma, ten, hocluc;
    private double gpa;
    private int xh;
    static int cnt = 1;

    public HocSinh(String ten, double gpa) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.gpa = gpa;
        if(gpa >= 9)
            this.hocluc = "Gioi";
        else if(gpa >= 7)
            this.hocluc = "Kha";
        else if(gpa >= 5)
            this.hocluc = "Trung Binh";
        else this.hocluc = "Yeu";
        this.xh = 0;
    }

    public void setXh(int xh) {
        this.xh = xh;
    }

    public double getGpa() {
        return gpa;
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", gpa) + " "  + hocluc + " " + xh;
    }

    @Override
    public int compareTo(HocSinh o) {
        return (int)(o.gpa) - (int)(this.gpa);
    } 
}
