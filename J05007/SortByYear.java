/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007;

import java.util.Comparator;

/**
 *
 * @author CAO DUC
 */
public class SortByYear implements Comparator<NhanVien>{

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        String s1 = o1.getNs().substring(6);
        String s2 = o2.getNs().substring(6);
        return s1.compareTo(s2);
    }
    
}
