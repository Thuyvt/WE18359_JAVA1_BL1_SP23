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
public class Day7 {

    public static void main(String[] args) {
        // Khởi tạo mảng có 5 phần tử
        int mangSo[] = new int[5];
        // Vừa khởi tạo vừa gán giá trị
        int mangSo2[] = {1, 4, 6, 5, 7};

        // Nhập giá trị cho mảng
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mangSo.length; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            mangSo[i] = sc.nextInt();
        }
        // Hiển thị lại giá trị của mảng
        System.out.println("Phan tu mang: " + Arrays.toString(mangSo));
        // Sắp xếp tăng dần
        Arrays.sort(mangSo);
        System.out.println("Phan tu sau khi sap xep: " + Arrays.toString(mangSo));
        
        // Tìm số nhỏ nhất
        int min = mangSo[0];
        for (int index = 1; index < mangSo.length; index++) {
            // C1 :
            if (min > mangSo[index]) {
                min = mangSo[index];
            }
            // C2
            min = Math.min(min, mangSo[index]);
        }
        System.out.println("Gia tri nho nhat: " + min);
        // Tìm giá trị trong mảng
        int i = Arrays.binarySearch(mangSo2, 4);
        System.out.println("Vi tri so 4 trong mangSo2 la: " + i);
        // Thay đổi giá trị toàn bộ phần tử trong mảng
        Arrays.fill(mangSo, 1);
        System.out.println("Gia tri mang so sau fill: " + Arrays.toString(mangSo));
        
        // Tính trung bình cộng
        int sum = 0, count = 0;
        for (int j = 0; j < mangSo.length; j++) {
            if (mangSo[j] % 3 == 0) {
                sum += mangSo[j];
                count++;
            }
        }
        float avg = (float) sum / count;
        System.out.println("Gia tri trung binh cong: " + avg);
    }
}
