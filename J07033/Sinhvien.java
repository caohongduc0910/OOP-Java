/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07033;

import java.util.Locale;

public class Sinhvien {
    private String id, ten, lop, mail;

    public Sinhvien(String id, String ten, String lop, String mail) {
        this.id = id;
        this.ten = "";
        String[] s = ten.trim().split("\\s+");
        for(String x : s){
            this.ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.lop = lop;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + mail;
    }
 
}
