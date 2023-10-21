
package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Khach implements Comparable<Khach>{
    private String id, ten, ma, bd, kt;
    private long songay;
    static int cnt = 1;

    public Khach(String ten, String ma, String bd, String kt) throws ParseException {
        this.id = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.ma = ma;
        this.bd = bd;
        this.kt = kt;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse(bd);
        Date d2 = sdf.parse(kt);
        this.songay = (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24);
    }

    public long getSongay() {
        return songay;
    }

    @Override
    public int compareTo(Khach o) {
        if(this.getSongay() > o.getSongay())
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + ma + " " + songay;
    }
  
}
