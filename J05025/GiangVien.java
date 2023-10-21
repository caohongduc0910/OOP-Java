
package J05025;


public class GiangVien implements Comparable<GiangVien>{
    String ma, hoten, ten, khoa, vt;
    public static int cnt = 1;

    public GiangVien(String hoten, String khoa) {
        this.ma = String.format("GV%02d", cnt++);
        this.hoten = hoten;
        String temp[] = hoten.trim().split("\\s+");
        this.ten = temp[temp.length-1];
        this.khoa = khoa;
        String[] s = khoa.toUpperCase().trim().split("\\s+");
        this.vt = "";
        for(String x : s){
            this.vt += x.charAt(0);
        }
    }

    @Override
    public int compareTo(GiangVien o) {
        if(!this.ten.equals(o.ten)){
            return this.ten.compareTo(o.ten);
        }
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return  ma + " " + hoten + " " + vt;
    }

}
