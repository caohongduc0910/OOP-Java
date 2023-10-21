
package J07059;

public class CaThi implements Comparable<CaThi>{
    
    private String id, ngay, gio, phong;
    public static int cnt = 1;

    public CaThi(String ngay, String gio, String phong) {
        this.id = String.format("C%03d", cnt++);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }

    public String getNgay() {
        return ngay;
    }

    public String getGio() {
        return gio;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + ngay + " " + gio + " " + phong;
    }

    @Override
    public int compareTo(CaThi o) {
        String s1 = this.getNgay() + " " + this.getGio();
        String s2 = o.getNgay() + " " + o.getGio();
        if(!s1.equals(s2))
            return s1.compareTo(s2);
        else return this.getId().compareTo(o.getId());
    }
  
}
