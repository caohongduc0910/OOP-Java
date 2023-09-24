
package J05018;


public class SinhVien {
    private String id, name, rank;
    private double d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, dtb;
    static int cnt = 1;

    public SinhVien(String name, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.id = "HS0" + cnt;
        cnt++;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
        this.dtb = (d1 * 2 + d2 * 2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10) / 12;
        this.dtb = (double) Math.round((double) (this.dtb) * 10) / 10;
    }
    
    
    
    public void solve(){
        if(this.dtb >= 9)
            this.rank = "XUAT SAC";
        else if(this.dtb >= 8)
            this.rank = "GIOI";
        else if(this.dtb >= 7)
            this.rank = "KHA";
        else if(this.dtb >= 5)
            this.rank = "TB";
        else this.rank = "YEU";
    }
    
    public String getId() {
        return id;
    }

    public double getDtb() {
        return dtb;
    }

    @Override
    public String toString() {
        solve();
        return id + " " + name + " " + String.format("%.1f", dtb) + " " + rank;
    }
  
}
