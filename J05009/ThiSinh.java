/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

public class ThiSinh {
    
    private int ma;
    private  String ten, ns;
    double d1, d2, d3, gpa;
    static int cnt = 1; 

    public ThiSinh(String ten, String ns, double d1, double d2, double d3) {
        this.ma = cnt++;
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.gpa = d1 + d2 + d3;
    }

    public double getGpa() {
        return gpa;
    }

    public int getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ns + " " + String.format("%.1f", gpa);
    }
      
}
