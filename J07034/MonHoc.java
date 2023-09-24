
package J07034;


public class MonHoc {
    private String ma, ten, tc;

    public MonHoc(String ma, String ten, String tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getTen() {
        return ten;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + tc;
    }
    
}
