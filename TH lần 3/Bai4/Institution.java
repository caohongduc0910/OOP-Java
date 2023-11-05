
package Bai4;

public class Institution {
    private String maTruong, tenTruong;

    public Institution(String maTruong, String tenTruong) {
        this.maTruong = maTruong;
        this.tenTruong = tenTruong;
    }

    public String getMaTruong() {
        return maTruong;
    }

    public void setMaTruong(String maTruong) {
        this.maTruong = maTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
}
