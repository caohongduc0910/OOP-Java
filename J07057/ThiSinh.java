package J07057;

public class ThiSinh implements Comparable<ThiSinh> {

    private String ma, ten, dt, tt;
    private double diem, kv;
    public static int cnt = 1;

    public ThiSinh(String ten, double diem, String dt, double kv) {
        this.ma = String.format("TS%02d", cnt++);
        String a[] = ten.trim().split("\\s+");
        this.ten = "";
        for (String x : a) {
            this.ten += x.substring(0, 1).toUpperCase()
                    + x.substring(1).toLowerCase() + " ";
        }
        this.diem = diem;
        this.dt = dt;
        this.kv = kv;
        if (kv == 1) {
            this.diem += 1.5;
        }
        if (kv == 2) {
            this.diem += 1;
        }
        if (!dt.equals("Kinh")) {
            this.diem += 1.5;
        }
        if (this.diem >= 20.5) {
            this.tt = "Do";
        } else {
            this.tt = "Truot";
        }
    }

    public String getMa() {
        return ma;
    }

    public double getDiem() {
        return diem;
    }

    

    @Override
    public int compareTo(ThiSinh o) {
        if (this.getDiem()> o.getDiem()) {
            return -1;
        } else if (this.getDiem()< o.getDiem()) {
            return 1;
        } else {
            return this.getMa().compareTo(o.getMa());
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + String.format("%.1f", diem) + " " + tt;
    }

}
