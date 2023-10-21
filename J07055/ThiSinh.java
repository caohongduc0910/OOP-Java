
package J07055;


public class ThiSinh implements Comparable<ThiSinh>{
    private String id, name, tt;
    private double d1, d2, d3, dtb;
    public static int cnt = 1;

    public ThiSinh(String name, double d1, double d2, double d3) {
        this.id = String.format("SV%02d", cnt++);
        String a[] = name.trim().split("\\s+");
        this.name = "";
        for (String x : a) {
            this.name += x.substring(0, 1).toUpperCase()
                    + x.substring(1).toLowerCase() + " ";
        }
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.dtb = d1 * 0.25 + d2 * 0.35 + d3 * 0.4;
        if(this.dtb >= 8)
            this.tt = "GIOI";
        else if(this.dtb >= 6.5)
            this.tt = "KHA";
        else if(this.dtb >= 5)
            this.tt = "TRUNG BINH";
        else this.tt = "KEM";
    }

    public double getDtb() {
        return dtb;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getDtb() > o.getDtb())
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return id + " " + name + String.format("%.2f", dtb) + " " + tt;
    }
    
}
