
package J07073;


public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, lt, th;
    private int tc;

    public MonHoc(String ma, String ten, int tc, String lt, String th) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
    }

    public String getMa() {
        return ma;
    }

    public String getTh() {
        return th;
    }
    

    @Override
    public String toString() {
        return ma + " " + ten + " " + tc + " " + lt + " " + th;
    }
    

    @Override
    public int compareTo(MonHoc o) {
        return this.getMa().compareTo(o.getMa());
    }
    
    
}
