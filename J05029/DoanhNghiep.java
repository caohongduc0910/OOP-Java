
package J05029;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int soluong;

    public DoanhNghiep(String ma, String ten, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.soluong == o.soluong){
            return this.ma.compareTo(o.ma);
        }
        else
            return o.soluong - this.soluong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soluong;
    }
  
}
