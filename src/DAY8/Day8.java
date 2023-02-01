/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY8;

/**
 *
 * @author ThuyVT
 */
public class Day8 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
//        SinhVien sv1 = new SinhVien();
//        sv1.ten = "thuy";
//        sv1.diem = 7.5;
//        System.out.println("Tên sinh viên:" + sv1.ten);
//        System.out.println("Điểm sinh viên:" + sv1.diem);
//        
//        SinhVien sv2 = new SinhVien();
//        sv2.ten = "luong";
//        sv2.diem = 20;
//        System.out.println("Tên sinh viên:" + sv2.ten);
//        System.out.println("Điểm sinh viên:" + sv2.diem);

         SinhVien sv1 = new SinhVien();
         sv1.setTen("thuy");
         sv1.setDiem(7.5);
         System.out.println("Tên sinh viên:" + sv1.getTen());
         System.out.println("Điểm sinh viên:" + sv1.getDiem());
         
         SinhVien sv2 = new SinhVien();
         sv2.nhap();
         sv2.xuat();
         
         for (int i = 0; i < 5; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            sv.xuat();
        }
         
         
    }
}
