
package Bai4;

public class CaThi {
    private String maCa, ngayThi, gioThi, phongThi;
    static int cnt = 1;
    
    public CaThi() {
    }

    public CaThi(String ngayThi, String gioThi, String phongThi) {
        this.maCa = String.format("C%03d", cnt++);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public String getGioThi() {
        return gioThi;
    }

    public void setGioThi(String gioThi) {
        this.gioThi = gioThi;
    }

    public String getPhongThi() {
        return phongThi;
    }

    public void setPhongThi(String phongThi) {
        this.phongThi = phongThi;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        CaThi.cnt = cnt;
    }
    
    
}
