package Bai1;

import java.util.Scanner;

public class CanBo {

	protected String ID;
	protected String hoTen;
	protected int namSinh;
	protected String gioiTinh;
	protected String diaChi;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID:");
		ID = sc.nextLine();
		System.out.print("Nhập họ tên:");
		hoTen = sc.nextLine();
		System.out.print("Nhập năm sinh:");
		namSinh = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập giới tính:");
		gioiTinh = sc.nextLine();
		System.out.print("Nhập địa chỉ:");
		diaChi = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-10s%-15s%-15d%-15s%-15s", ID, hoTen, namSinh, gioiTinh, diaChi);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}
}
