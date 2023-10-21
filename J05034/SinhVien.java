
package J05034;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop, mail, cty;
    private int stt;
    static int cnt = 1;

    public SinhVien(String ma, String ten, String lop, String mail, String cty) {
        this.stt = cnt++;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.cty = cty;
    }

    public String getCty() {
        return cty;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return stt + " " + ma + " " + ten + " " + lop + " " + mail + " " + cty;
    }
    
}
