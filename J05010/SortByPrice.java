/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010;

import java.util.Comparator;

public class SortByPrice implements Comparator<MatHang>{

    @Override
    public int compare(MatHang o1, MatHang o2) {
        if(o1.getLai() > o2.getLai())
            return -1;
        else return 1;
    }
    
}
