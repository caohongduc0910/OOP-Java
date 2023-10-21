package J07081;

public class SinhVien implements Comparable<SinhVien> {

    private String ma, ten, vt, sdt, email;

    public SinhVien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.vt = "";
        String s[] = ten.trim().split("\\s+");
        vt += s[s.length - 1] + s[0];
        for (int i = 1; i < s.length - 1; i++) {
            vt += s[i];
        }
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.vt.equals(o.vt)) {
            return this.ma.compareTo(o.ma);
        } else {
            return this.vt.compareTo(o.vt);
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt + " " + email;
    }
}
