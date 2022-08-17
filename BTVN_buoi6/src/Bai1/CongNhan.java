package Bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		do {
			System.out.print("Nhập cấp bậc:");
			bac = sc.nextInt();
		}while(bac<0 || bac >7);
	}
	public void xuat() {
		super.xuat();
		System.out.printf("%-15d\n", bac);
	}
}
