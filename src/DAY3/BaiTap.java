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
public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, duong, phuong, thanhPho;
        int soNha;
        System.out.println("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.println("Nhập số nhà: ");
        try {
            soNha = Integer.parseInt(sc.nextLine());
            System.out.println("123 123");
        } catch (Exception ex) {
            System.out.println("Sai định dạng số nhà");
            soNha = 12;
        }
//        int soNha = sc.nextInt();
//        sc.nextLine();
        System.out.println("Nhập tên đường: ");
        duong = sc.nextLine();
        System.out.println("Nhập tên phường: ");
        phuong = sc.nextLine();
        System.out.println("Nhập tên thành phố: ");
        thanhPho = sc.nextLine();
        System.out.println("Tên tôi là " + name);
        System.out.printf("Địa chỉ: %d, đường %s, %s, %s", soNha, duong, phuong, thanhPho);
    }

}
