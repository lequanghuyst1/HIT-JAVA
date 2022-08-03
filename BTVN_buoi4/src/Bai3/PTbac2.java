package Bai3;

import java.util.Scanner;

public class PTbac2 {
	private int a;
	private int b;
	private int c;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		a = sc.nextInt();
		System.out.print("Nhập b: ");
		b = sc.nextInt();
		System.out.print("Nhập c: ");
		c = sc.nextInt();
	}
	public void xuat() {
		System.out.println("Phương trình có dạng: "+a+"x^2 + "+b+"x+ "+c);
	}
	public void giaiPTBac2() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.println("\t x1=" + x1);
            System.out.println("\t x2=" + x2);
        } 
        else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
