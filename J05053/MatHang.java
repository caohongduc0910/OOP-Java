package J05053;

public class MatHang implements Comparable<MatHang> {

    private String ten, ma, stt;
    private long dongia, soluong, giamgia, thanhtien;

    public MatHang(String ten, String ma, long dongia, long soluong) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
        this.stt = this.ma.substring(1, 4);
        String type = this.ma.substring(4);
        //System.out.println(type);
        if (type.equals("1")) {
            this.giamgia = this.dongia * this.soluong * 50 / 100;
            this.thanhtien = this.dongia * this.soluong - this.giamgia;
        } else {
            this.giamgia = this.dongia * this.soluong * 30 / 100;
            this.thanhtien = this.dongia * this.soluong - this.giamgia;
        }
    }

    @Override
    public String toString() {
        return this.ten + " " + this.ma + " " + this.stt + " " + this.giamgia + " " + this.thanhtien;
    }

    public String getStt() {
        return stt;
    }

    @Override
    public int compareTo(MatHang o) {
        return this.getStt().compareTo(o.getStt());
    }

}
