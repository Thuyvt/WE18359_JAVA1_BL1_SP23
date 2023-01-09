/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY3;

/**
 *
 * @author ThuyVT
 */
public class ChuyenDoiDuLieu {
    public static void main(String[] args) {
        // Chuyển đổi giá trị 1 chuỗi -> dữ liệu nguyên thủy
        String diemToan = "9.5";
        String diemVan = "8.3";
        System.out.println(diemToan + diemVan);
        double dToan = Double.parseDouble(diemToan);
        double dVan = Double.parseDouble(diemVan);
        double diemTb = (dToan + dVan)/2;
        System.out.println("Điểm trung bình là " + diemTb);
        System.out.printf("Điểm trung bình là %.2f\n", diemTb);
        String diemAnh = "8.7F";
        float dAnh = Float.parseFloat(diemAnh);
        System.out.println("Điểm tiếng anh là " + dAnh);
    }
    
}
