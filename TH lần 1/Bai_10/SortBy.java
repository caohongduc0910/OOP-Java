/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_10;

import java.util.Comparator;

/**
 *
 * @author CAO DUC
 */
public class SortBy implements Comparator<SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if(o1.getSobai() != o2.getSobai())
            return o2.getSobai() - o1.getSobai();
        else{
            if(o1.getLuotsub() != o2.getLuotsub())
                return o1.getLuotsub() - o2.getLuotsub();
            else return o1.getTen().compareTo(o2.getTen());
        }
    }
    
}
