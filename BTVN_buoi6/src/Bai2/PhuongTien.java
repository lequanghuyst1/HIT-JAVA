package Bai2;

import java.util.Scanner;

public class PhuongTien {
	private String hoTen;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	private double thue;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên:");
		hoTen = sc.nextLine();
		System.out.print("Nhập loại xe:");
		loaiXe = sc.nextLine();
		System.out.print("Nhập dung tích:");
		dungTich = sc.nextInt();
		System.out.print("Nhập trị giá:");
		triGia = sc.nextFloat();
		if (dungTich < 100) {
			thue = triGia * 0.02;
		} else if (dungTich >= 100 && dungTich < 200) {
			thue = triGia * 0.06;
		} else {
			thue = triGia * 0.1;
		}
	}

	PhuongTien() {

	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double getTriGia() {
		return triGia;
	}

	public double getThue() {
		return thue;
	}

	public void xuat() {
		System.out.printf("%-20s%-15s%-20d%-20.2f%-20.2f\n", hoTen, loaiXe, dungTich, triGia, getThue());
	}
}
