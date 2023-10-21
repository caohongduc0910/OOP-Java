/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_BaoHanhSanPham;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author CAO DUC
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("C:\\Users\\CAO DUC\\Desktop\\Code\\JavaLearning\\src\\DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Product> hsp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            hsp.put(id, new Product(id, sc.nextLine(),
                    Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        ArrayList<List> arrL = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = String.format("KH%02d", i + 1);
            Customer cus = new Customer(id, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine()), sc.nextLine());
            Product pro = hsp.get(cus.getMaSP());
            arrL .add(new List(cus, pro));
        }
        Collections.sort(arrL);
        for(List l : arrL){
            System.out.println(l);
        }
    }
}

class List implements Comparable<List> {

    private Customer customer;
    private Product product;

    public List(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    private Date tinhngayHetHan() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.customer.getNgaymua());
        calendar.add(Calendar.MONTH, this.product.getTgBaoHanh());
        return calendar.getTime();
    }

    @Override
    public int compareTo(List o) {
        if (this.tinhngayHetHan().equals(o.tinhngayHetHan())) {
            return this.customer.getMa().compareTo(o.customer.getMa());
        }
        return this.tinhngayHetHan().compareTo(o.tinhngayHetHan());
    }

    @Override
    public String toString() {
        return customer + " " + this.customer.getSoLuong() * this.product.getGiaBan()
                + " " + new SimpleDateFormat("dd/MM/yyyy").format(tinhngayHetHan());
    }

}

class Customer {

    private String ma, hoVaTen, diaChi, maSP, day;
    private Integer soLuong;
    private Date ngaymua;

    public Customer(String ma, String hoVaTen, String diaChi, String maSP, Integer soLuong, String ngaymua) throws ParseException {
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.day = ngaymua.substring(0, 2);
        this.ngaymua = new SimpleDateFormat("dd/MM/yyyy").parse(ngaymua);
    }

    public String getMa() {
        return ma;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getDay() {
        return day;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    @Override
    public String toString() {
        return ma + " " + hoVaTen + " " + diaChi + " " + maSP;
    }
}

class Product {

    private String ma, ten;
    private long giaBan;
    private Integer tgBaoHanh;

    public Product(String ma, String ten, long giaBan, Integer tgBaoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.tgBaoHanh = tgBaoHanh;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public Integer getTgBaoHanh() {
        return tgBaoHanh;
    }

}
