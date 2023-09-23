/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007;

public class NhanVien {
    private String id, ten, gt, ns, dc, mst, hd;
    static int cnt = 1;

    public NhanVien(String ten, String gt, String ns, String dc, String mst, String hd) {
        this.id = String.format("%05d", cnt++);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }

    public String getNs() {
        return ns;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + hd;
    }    
}
