/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_10;

/**
 *
 * @author CAO DUC
 */
public class SinhVien {
    private String ten;
    private int sobai, luotsub;

    public SinhVien(String ten, int sobai, int luotsub) {
        this.ten = ten;
        this.sobai = sobai;
        this.luotsub = luotsub;
    }

    public String getTen() {
        return ten;
    }

    public int getSobai() {
        return sobai;
    }

    public int getLuotsub() {
        return luotsub;
    }

    @Override
    public String toString() {
        return ten + " " + sobai + " " + luotsub;
    } 
    
}
