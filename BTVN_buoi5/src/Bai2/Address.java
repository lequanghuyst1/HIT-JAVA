package Bai2;

import java.util.Scanner;

public class Address {
	private String ID;
	private String district;
	private String province;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID:");
		ID = sc.nextLine();
		System.out.print("Nhập district:");
		district = sc.nextLine();
		System.out.print("Nhập province:");
		province = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-15s%-15s%-15s\n", ID, district, province);
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvince() {
		return province;
	}
}
