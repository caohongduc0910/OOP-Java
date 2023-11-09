
package Bai4;

public class LichThi implements Comparable<LichThi>{
    private MonThi monThi;
    private CaThi caThi;
    private String maNhom;
    private int soSV;

    public LichThi(MonThi monThi, CaThi caThi, String maNhom, int soSV) {
        this.monThi = monThi;
        this.caThi = caThi;
        this.maNhom = maNhom;
        this.soSV = soSV;
    }

    @Override
    public int compareTo(LichThi o) {
        if(!this.caThi.getNgayThi().equals(o.caThi.getNgayThi()))
            return this.caThi.getNgayThi().compareTo(o.caThi.getNgayThi());
        else{
            if(!this.caThi.getGioThi().equals(o.caThi.getGioThi()))
                return this.caThi.getGioThi().compareTo(o.caThi.getGioThi());
            else return this.caThi.getMaCa().compareTo(o.caThi.getMaCa());
        }
    }

    @Override
    public String toString() {
        return this.caThi.getNgayThi() + " " + this.caThi.getGioThi() + " " + this.caThi.getPhongThi()
                + " " + this.monThi.getTenMon() + " " +  this.maNhom + " " + this.soSV;
    }

    public MonThi getMonThi() {
        return monThi;
    }

    public void setMonThi(MonThi monThi) {
        this.monThi = monThi;
    }

    public CaThi getCaThi() {
        return caThi;
    }

    public void setCaThi(CaThi caThi) {
        this.caThi = caThi;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }
    
    
  
}
