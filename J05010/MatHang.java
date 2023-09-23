/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010;

public class MatHang {
    private int id;
    private String ten, nhom;
    private double mua, ban, lai;
    static int cnt = 1;

    public MatHang(String ten, String nhom, double mua, double ban) {
        this.id = cnt++;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.lai = ban - mua;
    }

    public double getLai() {
        return lai;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + nhom + " " + String.format("%.2f", lai);
    }
    
}
