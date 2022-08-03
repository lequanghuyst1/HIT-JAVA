package Bai1;

import java.util.Scanner;

public class HinhChuNhat {
	private int a;
	private int b;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		a = sc.nextInt();
		System.out.print("Nhập chiều rộng: ");
		b = sc.nextInt();
	}
	public int dientich() {
		return a*b;
	}
	public int chuvi() {
		return (a+b)*2;
	}
	public void output() {
		System.out.print("\nChiều dài hcn: "+a);
		System.out.print("\nChiều rộng hcn: "+b);
		System.out.print("\nChu vi: "+chuvi());
		System.out.print("\nDiện tích: "+dientich());
		System.out.println("");
	} 
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {	
		return a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getB() {
		return b;
	}
}
