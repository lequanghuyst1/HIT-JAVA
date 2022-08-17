package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhập công việc:");
		congViec = sc.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.printf("%-15s\n", congViec);
	}
}
