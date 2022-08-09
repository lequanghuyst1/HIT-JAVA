package Bai1;

import java.util.Scanner;

public class QuanLy {
	private String maQL;
	private String hoTen;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã quản lí:");
		maQL = sc.nextLine();
		System.out.print("Nhập họ tên:");
		hoTen = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-15s%-15s", maQL, hoTen);

	}
}