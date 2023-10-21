/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05038;


public class NhanVien {
    private String ma, ten, chucvu;
    private int luongngay, luongthang, snc, thuong, phucap, tong;
    public static int cnt = 1;

    public NhanVien(String ten, int luongngay, int snc, String chucvu) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.chucvu = chucvu;
        this.luongngay = luongngay;
        this.snc = snc;
        this.luongthang = luongngay * snc;
        if(snc >= 25) {
            this.thuong = 20 * luongthang / 100;
        }
        else if(snc >= 22){
            this.thuong = 10 * luongthang / 100;
        }
        else this.thuong = 0;
        
        if(chucvu.equals("GD")){
            this.phucap = 250000;
        }
        else if(chucvu.equals("PGD")){
            this.phucap = 200000;
        }
        else if(chucvu.equals("TP"))
            this.phucap = 180000;
        else this.phucap = 150000; 
        this.tong = luongthang + this.thuong + this.phucap;
    }

    public int getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongthang + " " + thuong + " " + phucap + " " + tong;
    }
    
    
}
