/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_DanhSachLienLac;

public class SinhVien implements Comparable<SinhVien>{
    private String msv, ten, lop, email, sdt;

    public SinhVien(String msv, String ten, String lop, String email, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email + " " + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop))
            return this.msv.compareTo(o.msv);
        else return this.lop.compareTo(o.lop);
    }
 
}
