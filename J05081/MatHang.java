/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081;

/**
 *
 * @author CAO DUC
 */
public class MatHang {
    private static int cnt = 1;
    private String id, ten, donvi;
    private int giamua, giaban, lai;

    public MatHang(String ten, String donvi, int giamua, int giaban) {
        id = String.format("MH%03d", cnt++);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        lai = giaban - giamua;
    }

    public int getLai() {
        return lai;
    }
    
    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " + lai;
    }  
}
