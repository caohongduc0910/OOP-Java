
package J05011;

public class Gamer {
    private String ma, ten, bd, kt;
    private int gio, phut;

    public Gamer(String ma, String ten, String bd, String kt) {
        this.ma = ma;
        this.ten = ten;
        this.bd = bd;
        this.kt = kt;
    }
    
    public String Gettime(){
        int t1 = Integer.parseInt(kt.substring(0,2)) * 60 
                + Integer.parseInt(kt.substring(3));
        int t2 = Integer.parseInt(bd.substring(0,2)) * 60 
                + Integer.parseInt(bd.substring(3));
        int sum = t1 - t2;
        String str;
        this.gio = (int) sum / 60;
        this.phut = sum - gio * 60;
        str = this.gio + " gio " + this.phut + " phut";
        return str;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + Gettime();
    }
  
}
