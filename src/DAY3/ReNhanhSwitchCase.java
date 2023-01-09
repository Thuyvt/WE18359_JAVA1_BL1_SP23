/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ReNhanhSwitchCase {
    public static void main(String[] args) {
        System.out.println("===Menu====");
        System.out.println("1. Tính tổng");
        System.out.println("2. Đếm số lẻ");
        System.out.println("3. Tính trung bình");
        System.out.println("Nhập chương trình cần chạy:");
        Scanner sc = new Scanner(System.in);
        int chuongTrinh = sc.nextInt();
        switch(chuongTrinh) {
            case 1 -> {
                tinhTong();
                break;
            }
            case 2 -> {
                demSo();
                break;
            }
            case 3 -> {
                tbCong();
                break;
            }
            default -> {
                System.out.println("Nhập sai");
            }
        }
    }
    
    // Tính tổng từ 1 đến số nhập vào
    public static void tinhTong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        int so = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= so; i++) {
            tong = tong + i;
            // tong += i;
        }
        System.out.printf("Tổng từ 1 đến %d là %d \n", so, tong);
    }
    // đếm các số lẻ từ 1 đến số nhập vào
    public static void demSo() {}
    // Tính trung cộng các số chẵn từ 1 đến số nhập vào
    public static void tbCong() {}
}
