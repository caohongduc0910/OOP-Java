package J07052;

public class ThiSinh implements Comparable<ThiSinh>{

    private String ma, ten, kv, tt, ut;
    private double d1, d2, d3, tong;

    public ThiSinh(String ma, String ten, double d1, double d2, double d3) {
        this.ma = ma;
        this.kv = ma.substring(0, 3);
        if (this.kv.equals("KV1")) {
            this.ut = "0.5";
        } else if (this.kv.equals("KV2")) {
            this.ut = "1";
        } else {
            this.ut = "2.5";
        }
        String a[] = ten.trim().split("\\s+");
        this.ten = "";
        for (String x : a) {
            this.ten += x.substring(0,1).toUpperCase() 
                            + x.substring(1).toLowerCase() + " ";
        }
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1 * 2 + d2 + d3 + Double.parseDouble(this.ut);
    }

    public String getMa() {
        return ma;
    }

    public double getTong() {
        return tong;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getTong() > o.getTong())
            return -1;
        else if(this.getTong() < o.getTong())
            return 1;
        else return this.getMa().compareTo(o.getMa());
    }

    @Override
    public String toString() {
        if(tong == (int)tong){
            return ma + " " + ten + ut + " " + String.format("%.0f", tong) + " " + tt;
        }
        else return ma + " " + ten + ut + " " + String.format("%.1f", tong) + " " + tt;
    } 

}
