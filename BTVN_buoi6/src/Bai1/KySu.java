package Bai1;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDT;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhập ngành đào tạo:");
		nganhDT = sc.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.printf("%-15s\n", nganhDT);
	}
}
