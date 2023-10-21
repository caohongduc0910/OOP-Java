
package J05055;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class VanDV{
    private String ma, ten, ns;
    Date tgxp, tgdd;
    private long ttthucte, ttxephang, uutien;
    private int xh, tuoi;
    private SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");   
    static int cnt = 1;

    public VanDV(String ten, String ns, String tgxp, String tgdd) throws ParseException {
        this.ma = String.format("VDV%02d", cnt++);
        this.ten = ten;
        this.ns = ns;
        this.tgxp = sdf1.parse(tgxp);
        this.tgdd = sdf1.parse(tgdd);
        this.tuoi = 2021 - sdf2.parse(ns).getYear() - 1900;
        if(this.tuoi >= 32)
            this.uutien = 3;
        else if(this.tuoi>= 25)
            this.uutien = 2;
        else if(this.tuoi >= 18)
            this.uutien = 1;
        this.ttthucte = (this.tgdd.getTime() - this.tgxp.getTime()) / 1000;
        this.ttxephang = this.ttthucte - this.uutien;   
    }
    
    public String Change(long t){
        long h = t/3600;
        long m = (t - h * 3600) / 60;
        long s = t - h * 3600 - m * 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public void setXh(int xh) {
        this.xh = xh;
    }

    public long getTtxephang() {
        return ttxephang;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + Change(ttthucte) + " " + Change(uutien) + " " + Change(ttxephang) + " " + xh;
    } 

    
}
