package Bai4;

public class Register implements Comparable<Register> {

    private Institution hocvien;
    private String tenDoi;

    public Register(Institution hocvien, String tenDoi) {
        this.hocvien = hocvien;
        this.tenDoi = tenDoi;
    }

    public Institution getHocvien() {
        return hocvien;
    }

    public String getTenDoi() {
        return tenDoi;
    }

    @Override
    public int compareTo(Register o) {
        if (!this.hocvien.getTenTruong().equals(o.hocvien.getTenTruong())) {
            return this.hocvien.getTenTruong().compareTo(o.hocvien.getTenTruong());
        } else {
            return this.tenDoi.compareTo(o.tenDoi);
        }
    }

    @Override
    public String toString() {
        return tenDoi + " " + hocvien.getTenTruong();
    }

}
