
package J05006;

public class NhanVien {
    private String id, ten, gt, dob, dc, mst, nkhd;
    private static int cnt = 1;

    public NhanVien(String ten, String gt, String dob, String dc, String mst, String nkhd) {
        this.id = String.format("%05d", cnt++);
        this.ten = ten;
        this.gt = gt;
        this.dob = dob;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gt + " " + dob + " " + dc + " " + mst + " " + nkhd;
    }
}
