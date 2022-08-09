package Bai2;

import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số sinh viên:");
		int n = sc.nextInt();
		Student st[] = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\tNhập sinh viên thứ " + (i + 1));
			st[i] = new Student();
			st[i].nhap();
		}

		System.out.println("\t\t\tDanh sách sinh viên");
		System.out.printf("%-15s%-15s%-10s%-15s%-15s%-15s\n", "IDSV", "Name", "Age", "ID", "District", "Province");
		for (int i = 0; i < n; i++) {
			st[i].xuat();
		}
		System.out.println("");

		// Tìm kiếm sinh viên theo ID
		System.out.print("Nhập ID sinh viên muốn tìm:");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("\t\t\tThông tin sinh viên có MaSV là " + s);
		System.out.printf("%-15s%-15s%-10s%-15s%-15s%-15s\n", "IDSV", "Name", "Age", "ID", "District", "Province");
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (st[i].getID().compareTo(s) == 0) {
				dem++;
				st[i].xuat();
			}
		}
		if (dem == 0) {
			System.out.println("Không tìm thấy MaSV muốn tìm");
		}

		// Sửa các sinh viên có province là “Thanh Hóa” thành “Hải Phòng”
		System.out.println("");
		System.out.println("\t\t\tDanh sách sinh viên sau khi sửa");
		System.out.printf("%-15s%-15s%-10s%-15s%-15s%-15s\n", "IDSV", "Name", "Age", "ID", "District", "Province");
		for (int i = 0; i < n; i++) {
			if (st[i].ad.getProvince().compareTo("Thanh Hóa") == 0) {
				st[i].ad.setProvince("Hải Phòng");
			}
			st[i].xuat();
		}

		// Xóa sinh viên theo Id.
		System.out.println("");
		System.out.print("Nhập ID sinh viên muốn xóa:");
		String xoa = sc.nextLine();
		for (int i = 0; i < n; i++) {
			while (st[i].getID().compareTo(xoa) == 0) {
				for (int j = i; j < n - 1; j++) {
					st[j] = st[j + 1];
					n--;
				}
			}
		}
		System.out.println("\t\t\tDanh sách sinh viên sau khi xóa");
		System.out.printf("%-15s%-15s%-10s%-15s%-15s%-15s\n", "IDSV", "Name", "Age", "ID", "District", "Province");
		for (int i = 0; i < n; i++) {
			st[i].xuat();
		}
	}
}
