/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên:");
        int soLuong = sc.nextInt();
        sc.nextLine();
        if (soLuong < 0) {
            System.out.println("Nhập sai số lượng");
        } else {
            String ten[] = new String[soLuong];
            double diem[] = new double[soLuong];
            for (int i = 0; i < soLuong; i++) {
                System.out.printf("Nhập tên:");
                ten[i] = sc.nextLine();
                System.out.printf("Nhập điểm:");
                diem[i] = sc.nextDouble();
                sc.nextLine();
            }
            
            System.out.println("Mang sinh viên: " + Arrays.toString(ten));
            System.out.println("Mang điểm: " + Arrays.toString(diem));
            // Sap xep gia tri mang
            sort(ten, diem);
            // Hien thi gia trị
            for (int i = 0; i < ten.length; i++) {
                System.out.println("Họ tên:" + ten[i]);
                System.out.println("Điểm:" + diem[i]);
                if (diem[i] >= 9) {
                    System.out.println("Xuất sắc");
                } else if (diem[i] >= 7.5) {
                    System.out.println("Giỏi");
                } else if (diem[i] >= 6.5) {
                    System.out.println("Khá");
                } else if (diem[i] >= 5) {
                    System.out.println("Trung bình");
                }
            }
        }
    }
    public static void sort(String mangTen[], double mangDiem[]) {
        for (int i = 0; i < mangTen.length; i++) {
            for (int j = i + 1; j < mangTen.length; j++) {
                if (mangDiem[i] > mangDiem[j]) {
                    double diem = mangDiem[i];
                    mangDiem[i] = mangDiem[j];
                    mangDiem[j] = diem;
                    
                    String ten = mangTen[i];
                    mangTen[i] = mangTen[j];
                    mangTen[j] = ten;
                }
            }
        }
    
    }
}
