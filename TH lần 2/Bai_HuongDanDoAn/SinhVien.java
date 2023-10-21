/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_HuongDanDoAn;

public class SinhVien implements Comparable<SinhVien>{
    private String msv, ten, lop, mail, sdt;
    private String tengv, detai;

    public SinhVien(String msv, String ten, String lop, String mail, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }

    public String getMsv() {
        return msv;
    }
    
    
    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + tengv + detai + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv);
    }
     
}
