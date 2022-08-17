package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
	public static Scanner sc = new Scanner(System.in);
	public static int n;
	public static ArrayList<PhuongTien> list = new ArrayList<>(n);

	public static void main(String[] args) {
		int chon;
		do {
			System.out.println("\t\t\tMENU");
			System.out.println("1.Nhập thông tin và tạo danh sách các xe.");
			System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("3.Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần");
			System.out.println("4.Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần");
			System.out.println("5.Thoát chương trình");
			System.out.print("Nhập lựa chọn của bạn: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				nhap();
				break;
			}
			case 2: {
				System.out.println("\t\tBảng kê khai tiền thuế trước bạ của các xe.");
				xuat();
				break;
			}
			case 3: {
				System.out.println("\t\tBảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần");
				giam_dan();
				break;
			}
			case 4: {
				System.out.println("\t\tBảng kê khai tiền thuế trước bạ của các xe với tiền thuế tăng dần");
				tang_dan();
				break;
			}
			case 5:
				System.out.println(" Cam on ban da su dung chuong trinh");
				return;
			default: {
				System.out.println("Không có chức năng này ");
				break;
			}
			}

		} while (true);

	}

	// hàm nhập
	public static void nhap() {
		System.out.print("Nhập số lượng phương tiện: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			PhuongTien p = new PhuongTien();
			System.out.println("\tNhập thông tin phương tiện thứ " + (i + 1));
			p.nhap();
			list.add(p);
		}
	}

	public static void xuat() {
		System.out.printf("%-20s%-15s%-20s%-20s%-20s\n", "Họ tên chủ xe", "Loại xe", "Dung Tích", "Trị giá",
				"Thuế phải nộp");
		for (int i = 0; i < n; i++) {
			list.get(i).xuat();
		}
	}

	// tiền thuế giảm dần
	public static void giam_dan() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list.get(i).getThue() < list.get(j).getThue()) {
					Collections.swap(list, i, j);
				}
			}
		}
		xuat();
	}

	// tiền thuế tăng dần
	public static void tang_dan() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list.get(i).getThue() > list.get(j).getThue()) {
					Collections.swap(list, i, j);
				}
			}
		}
		xuat();
	}
}
