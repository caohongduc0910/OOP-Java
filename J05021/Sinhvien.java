
package J05021;

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

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + mail;
    } 
    
}
