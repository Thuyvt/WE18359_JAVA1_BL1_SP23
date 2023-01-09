/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY2;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class DAY2 {
    public static void main(String[] args) {
        // Hiển thị tên, năm sinh, số điện thoại
        String hoTen = "Thúy";
        int namSinh = 1993;
        String soDienThoai = "0886341201";
        
        System.out.printf("Tên tôi là %s, sinh năm %d, số điện thoại %s\n",
                hoTen, namSinh, soDienThoai);
        System.out.println("Tên tôi là " + hoTen + " sinh năm " + namSinh + " số điện thoại " + soDienThoai);
        // Khai báo Scanner để nhập giá trị vào chương trình
        Scanner sc = new Scanner(System.in);
        // Nhập tên, tuổi, số đo 3 vòng của người yêu cũ
//        String ten;
//        int tuoi;
//        double vong1, vong2, vong3;
//        System.out.print("Nhập tên người yêu cũ: ");
//        // Gọi hàm nextLine() để nhận vào giá trị là 1 dòng dữ liệu
//        ten = sc.nextLine();
//        System.out.print("Nhập tuổi người yêu cũ: ");
//        tuoi = sc.nextInt();
//        System.out.print("Nhập vòng 1: ");
//        vong1 = sc.nextDouble();
//        System.out.print("Nhập vòng 2: ");
//        vong2 = sc.nextDouble();
//        System.out.print("Nhập vòng 3: ");
//        vong3 = sc.nextDouble();
//        System.out.printf("Tên người yêu cũ là %s\n", ten);
//        System.out.printf("%d tuổi\n", tuoi);
//        System.out.printf("Số đo 3 vòng là %f %.2f %.3f\n", vong1, vong2, vong3);
        // Nhập thông tin họ tên, số nhà, tên đường, tên phường, tên thành phố
        System.out.println("Nhập họ tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập số nhà: ");
//        int soNha = Integer.parseInt(sc.nextLine());
        int soNha = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên đường: ");
        String duong = sc.nextLine();
        System.out.println("Nhập tên phường: ");
        String phuong = sc.nextLine();
        System.out.println("Nhập tên thành phố: ");
        String thanhPho = sc.nextLine();
        System.out.println("Tên tôi là " + name);
        System.out.printf("Địa chỉ: %d, đường %s, %s, %s", soNha, duong, phuong, thanhPho);
    }
}
