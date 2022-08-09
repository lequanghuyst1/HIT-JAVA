package Bai1;

import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng phòng máy:");
		int n = sc.nextInt();
		PhongMay p[] = new PhongMay[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\tNhập thông tin phòng máy "+i+1);
			p[i] = new PhongMay();
			p[i].nhap();
		}
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Mã phòng", "Tên phòng", "Diện tích", "Mã QL",
				"Họ tên", "Mã máy", "Kiểu máy", "Tình trạng");
		for (int i = 0; i < n; i++) {
			p[i].xuat();
		}
	}
}
