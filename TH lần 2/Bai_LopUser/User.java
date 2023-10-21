/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_LopUser;

public class User {
    private String username, password;
    private int thanhcong = 0;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getThanhcong() {
        return thanhcong;
    }

    public void setThanhcong(int thanhcong) {
        this.thanhcong = thanhcong;
    }

    @Override
    public String toString() {
        return thanhcong + " ";
    }
  
}
