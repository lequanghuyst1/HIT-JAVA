package Bai1;

import java.util.Scanner;

public class PhongMay {
	private String maPhong;
	private String tenPhong;
	private float dienTich;
	QuanLy x;
	May y;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã phòng:");
		maPhong = sc.nextLine();
		System.out.print("Nhập tên phòng:");
		tenPhong = sc.nextLine();
		System.out.print("Nhập diện tích:");
		dienTich = sc.nextInt();
		x = new QuanLy();
		x.nhap();
		y = new May();
		y.nhap();
	}

	public void xuat() {
		System.out.printf("%-15s%-15s%-15f", maPhong, tenPhong, dienTich);
		x.xuat();
		y.xuat();
	}
}
