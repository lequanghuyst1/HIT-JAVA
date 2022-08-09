package Bai1;

import java.util.Scanner;

public class May {
	private String maMay;
	private String kieuMay;
	private String tinhTrang;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã máy:");
		maMay = sc.nextLine();
		System.out.print("Nhập kiểu máy:");
		kieuMay = sc.nextLine();
		System.out.print("Nhập tình trạng:");
		tinhTrang = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-15s%-15s%-15s\n", maMay, kieuMay, tinhTrang);
	}
}
