
package J05032;


public class Nguoi implements Comparable<Nguoi>{
    private String ten, ns, ngay, thang, nam;

    public Nguoi(String ten, String ns) {
        this.ten = ten;
        this.ns = ns;
        String s[] = ns.split("/");
        this.ngay = s[0];
        this.thang = s[1];
        this.nam = s[2];
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(Nguoi o) {
        if(!this.nam.equals(o.nam)){
            return this.nam.compareTo(o.nam);
        }
        else{
            if(!this.thang.equals(o.thang)){
                return this.thang.compareTo(o.thang);
            }
            else return this.ngay.compareTo(o.ngay);
        }
    }
    
    
    
}
