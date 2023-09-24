
package J07037;

public class DoanhNghiep {
    private String id, ten, so;

    public DoanhNghiep(String id, String ten, String so) {
        this.id = id;
        this.ten = ten;
        this.so = so;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + so;
    }
  
}
