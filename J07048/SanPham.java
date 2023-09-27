
package J07048;

public class SanPham implements Comparable<SanPham> {

    private String ma, ten;
    private int gia, bh;

    public SanPham(String ma, String ten, int gia, int bh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }

    public String getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + bh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.getGia() != o.getGia())
            return o.getGia() - this.getGia();
        else return this.getMa().compareTo(o.getMa());
    }

}
