package Bai2;

import java.util.Scanner;

public class Student {
	private String Id;
	private String name;
	private int age;
	Address ad;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID sinh viên:");
		Id = sc.nextLine();
		System.out.print("Nhập name:");
		name = sc.nextLine();
		System.out.print("Nhập age:");
		age = sc.nextInt();
		sc.nextLine();
		ad = new Address();
		ad.nhap();
	}

	public void xuat() {
		System.out.printf("%-15s%-15s%-10d", Id, name, age);
		ad.xuat();
	}

	public void setID(String ID) {
		this.Id = Id;
	}

	public String getID() {
		return Id;
	}

}
