
package J07045;


public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kh, ten, dongia, phi;

    public LoaiPhong(String s) {
        String[] x = s.split("\\s+");
        this.kh = x[0];
        this.ten = x[1];
        this.dongia = x[2];
        this.phi = x[3];
    }

    public String getTen() {
        return ten;
    }
    

    @Override
    public String toString() {
        return kh + " " + ten + " " + dongia + " " + phi;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.getTen().compareTo(o.getTen());
    }
     
}
