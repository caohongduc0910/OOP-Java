/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07033;

import java.util.Comparator;

public class SortByID implements Comparator <Sinhvien>{

    @Override
    public int compare(Sinhvien o1, Sinhvien o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}
