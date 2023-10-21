
package J05052;

public class MatHang {
    private String ten, ma, stt;
    private long dongia, soluong, giamgia, thanhtien;

    public MatHang(String ten, String ma, long dongia, long soluong) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    
    public void solve(){
        this.stt = this.ma.substring(1,4);
        String type = this.ma.substring(4);
        //System.out.println(type);
        if(type.equals("1")){
            this.giamgia = this.dongia * this.soluong * 50 / 100;
            this.thanhtien = this.dongia * this.soluong - this.giamgia;
            //System.out.println(this.giamgia + " " + this.thanhtien);
        }
        else{
            this.giamgia = this.dongia * this.soluong * 30 / 100;
            this.thanhtien = this.dongia * this.soluong - this.giamgia;
            //System.out.println(this.giamgia + " " + this.thanhtien);
        }
    }

    @Override
    public String toString() {
        solve();
        return this.ten + " " + this.ma + " " + this.stt + " " + this.giamgia + " " + this.thanhtien;
    }
   
}
