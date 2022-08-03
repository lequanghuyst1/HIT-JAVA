package Bai2;

import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nhân viên:");
		int n = sc.nextInt();
		NhanVien nv[] = new NhanVien[n];
		for(int i=0;i<n;i++) {
			System.out.println("\tNhập thông tin nhân viên thứ "+(i+1));
			nv[i] = new NhanVien();
			nv[i].nhap();
		}
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "Bophan");
		for(int i=0;i<n;i++) {
			nv[i].xuat();
		}
	}

}
