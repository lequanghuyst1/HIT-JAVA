package Bai2;

import java.util.Scanner;

public class NhanVien {
	private static int maNV=0;
	private String tenNV;
	private int tuoi;
	private String diaChi;
	private String BPLV;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên nhân viên:");
		tenNV = sc.nextLine();
		System.out.print("Nhập tuổi:");
		tuoi =sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập địa chỉ:");
		diaChi =sc.nextLine();
		System.out.print("Nhập bộ phận làm việc:");
		BPLV =sc.nextLine();
	}
	public void xuat() {
		maNV++;
		System.out.printf("%-10d%-10s%-10d%-10s%-10s\n", maNV, tenNV, tuoi, diaChi, BPLV);
	}
}
