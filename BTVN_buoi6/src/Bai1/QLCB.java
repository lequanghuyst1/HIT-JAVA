package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<CongNhan> listCN = new ArrayList<>();
	public static ArrayList<NhanVien> listNV = new ArrayList<>();
	public static ArrayList<KySu> listKS = new ArrayList<>();

	public static void main(String[] args) {
		int luaChon;
		do {
			System.out.println("\t\t\tMENU");
			System.out.println("1: Add 1 cán bộ vào List tương ứng");
			System.out.println("2: Hiển thị danh sách các cán bộ");
			System.out.println("3: Xóa 1 cán bộ theo id");
			System.out.println("4: Tìm kiếm 1 cán bộ theo id");
			System.out.println("5: Dừng chương trình");

			System.out.print("Mời nhập lựa chọn: ");
			luaChon = sc.nextInt();
			sc.nextLine();

			switch (luaChon) {
			case 1: {
				nhapCanBo();
				break;
			}

			case 2: {
				System.out.println("\t\t--------------Danh sách các cán bộ--------------");
				xuatCN();
				xuatNV();
				xuatKS();
				break;
			}

			case 3: {
				System.out.println("\t\tDanh sách cán bộ sau khi xóa:");
				xoaCanBo();
				break;
			}
			case 4: {
				timCanBo();
				break;
			}

			case 5: {
				System.out.println("Chương trình kết thúc!!!");
				break;
			}
			}

		} while (true);
	}

	// nhập 1 cán bộ
	public static void nhapCanBo() {
		System.out.println("Mời bạn chọn chức vụ cán bộ muốn thêm:");
		System.out.println("\t1. Công nhân");
		System.out.println("\t2. Nhân viên");
		System.out.println("\t3. Kỹ sư");
		int chon = sc.nextInt();
		switch (chon) {
		case 1: {
			CongNhan cn = new CongNhan();
			cn.nhap();
			listCN.add(cn);
			break;
		}
		case 2: {
			NhanVien nv = new NhanVien();
			nv.nhap();
			listNV.add(nv);
			break;
		}

		case 3: {
			KySu ks = new KySu();
			ks.nhap();
			listKS.add(ks);
			break;
		}
		}
	}

	// xuất danh sách
	public static void xuatCN() {
		if (listCN.isEmpty()) {
			System.out.println("Chưa có công nhân nào!!!");
		} else {
			System.out.println("\t\tDanh sách công nhân ");
			System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ",
					"Cấp bậc");
			for (int i = 0; i < listCN.size(); i++) {
				listCN.get(i).xuat();
			}
		}
	}

	public static void xuatNV() {
		if (listNV.isEmpty()) {
			System.out.println("Chưa có nhân viên nào!!!");
		} else {
			System.out.println("\t\tDanh sách nhân viên ");
			System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ",
					"Công việc");
			for (int i = 0; i < listNV.size(); i++) {
				listNV.get(i).xuat();

			}

		}
	}

	public static void xuatKS() {
		if (listKS.isEmpty()) {
			System.out.println("Chưa có kỹ sư nào!!!");
		} else {
			System.out.println("\t\tDanh sách kỹ sư ");
			System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Họ tên", "Năm sinh", "Giới tính", "Địa chỉ",
					"Ngành đào tạo");
			for (int i = 0; i < listKS.size(); i++) {
				listKS.get(i).xuat();
			}
		}
	}

	// xóa 1 cán bộ theo id
	public static void xoaCanBo() {
		String id;
		int dem = 0;
		System.out.print("Nhập id muốn xóa:");
		id = sc.nextLine();
		for (int i = 0; i < listCN.size(); i++) {
			if (listCN.get(i).getID().compareTo(id) == 0) {
				dem++;
				listCN.remove(i);
			}
		}
		xuatCN();

		for (int i = 0; i < listNV.size(); i++) {
			if (listNV.get(i).getID().compareTo(id) == 0) {
				dem++;
				listNV.remove(i);
			}
		}
		xuatNV();

		for (int i = 0; i < listKS.size(); i++) {
			if (listKS.get(i).getID().compareTo(id) == 0) {
				dem++;
				listKS.remove(i);
			}
		}
		xuatKS();
		if (dem == 0) {
			System.out.println("Không tìm thấy ID muốn xóa!!!");
		}

	}

	// Tìm kiếm 1 cán bộ theo ID
	public static void timCanBo() {
		String id;
		int dem = 0;
		System.out.print("Nhập id muốn tìm:");
		id = sc.nextLine();
		System.out.println("\t\tThông tin cán bộ muốn tìm kiếm");
		for (int i = 0; i < listCN.size(); i++) {
			if (listCN.get(i).getID().compareTo(id) == 0) {
				dem++;
				xuatCN();
			}
		}

		for (int i = 0; i < listNV.size(); i++) {
			if (listNV.get(i).getID().compareTo(id) == 0) {
				dem++;
				xuatNV();
			}
		}

		for (int i = 0; i < listKS.size(); i++) {
			if (listKS.get(i).getID().compareTo(id) == 0) {
				dem++;
				xuatKS();
			}
		}
		if (dem == 0) {
			System.out.println("Không tìm thấy thông tin cán bộ muốn tìm!!!");
		}

	}
}