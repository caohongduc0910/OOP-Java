
package J05027;


public class GiangVien{
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

    public String getHoTen() {
        return hoten;
    }

    @Override
    public String toString() {
        return  ma + " " + hoten + " " + vt;
    }

}
