/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY8;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class SinhVien {
    // Thuộc tính của đối tượng sinh viên
    // Mã sinh viên
    private String ma;
    // Tên sinh viên
    private String ten;
    // Tuổi
    private int tuoi;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // Điểm
    private double diem;
    // Email
    private String email;
    
    // Lấy giá trị thuộc tính tên của đối tượng
    public String getTen() {
        return this.ten;
    }
    // Gán giá trị cho biến tên
    public void setTen(String ten) {
            this.ten = ten;
    }
    public double getDiem() {
        return this.diem;
    }
    
    public void setDiem(double diem) {
        if (diem < 0 || diem > 10) {
            System.out.println("Điểm không hợp lệ");
        } else {
            this.diem = diem;
        }
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        // C1
        String name = sc.nextLine();
        this.setTen(name);
        // C2:
//        this.setTen(sc.nextLine());
        System.out.println("Nhập điểm:");
        this.setDiem(sc.nextDouble());
    }
    
    public void xuat() {
        System.out.printf("Tên sinh vien %s, điểm là %.2f\n", this.getTen(), this.getDiem());
    }
}
