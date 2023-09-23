/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

import java.util.Comparator;

public class SortByGPA implements Comparator<ThiSinh>{

    @Override
    public int compare(ThiSinh o1, ThiSinh o2) {
        return o1.getMa() - o2.getMa();
    }   
    
}
