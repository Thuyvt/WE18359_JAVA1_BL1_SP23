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
public class ReNhanhIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm: ");
        int diemTb = sc.nextInt();
        // C1: điều kiện xuôi
        if (diemTb > 50 && diemTb < 80) {
            System.out.println("Loại trung bình");
        } else if (diemTb >= 80 && diemTb < 90) {
            System.out.println("Loại khá");
        } else if (diemTb >= 90){
            System.out.println("Loại giỏi");
        }
        // C2: điều kiện
        if (diemTb >= 90) {
            System.out.println("Loại giỏi");
        } else if(diemTb >= 80) {
            System.out.println("Loại khá");
        } else if (diemTb > 50) {
            System.out.println("Loại trung bình");
        }
    }
}
