package Bai_13;

import java.util.Objects;

public class MonHoc {

    private String ma, ten, hinhthuc;

    public MonHoc(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc;

    }
}
