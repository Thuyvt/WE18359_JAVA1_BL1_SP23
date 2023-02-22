/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY15;

/**
 *
 * @author ThuyVT
 */
public class MonAn {
    private String ten;
    private int gia;
    private int soLuong;

    public MonAn() {
    }

    public MonAn(String ten, int gia, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MonAn{" + "ten=" + ten + ", gia=" + gia + ", soLuong=" + soLuong + '}';
    }
    
    public String getGiaMon() {
        return this.gia > 50 ? "Dat" : "Re"; 
    }
    
    public int tong() {
        return this.soLuong * this.gia;
    }
}
