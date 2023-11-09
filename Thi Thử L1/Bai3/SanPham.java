
package Bai3;

public class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private int giaBan, thoiHan;

    public SanPham(String ma, String ten, int giaBan, int thoiHan) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.thoiHan = thoiHan;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + giaBan + " " + thoiHan;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.giaBan != o.giaBan)
            return o.giaBan - this.giaBan;
        else return this.ma.compareTo(o.ma);
    }

}
