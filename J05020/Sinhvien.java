
package J05020;

public class Sinhvien {
    private String ma, ten, lop, mail;

    public Sinhvien(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + mail;
    } 
    
}
