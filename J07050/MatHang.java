/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050;


public class MatHang implements Comparable<MatHang>{
    private String id, ten, loai;
    private double mua, ban, loinhuan;
    public static int cnt = 1;

    public MatHang(String ten, String loai, double mua, double ban) {
        this.id = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = ban - mua;
    }

    public double getLoinhuan() {
        return loinhuan;
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.getLoinhuan() > o.getLoinhuan())
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + loai + " " + String.format("%.2f", loinhuan);
    }
 
}
