package Bai2;

import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập cạnh a:");
		int a=sc.nextInt();
		System.out.print("Nhập cạnh b:");
		int b=sc.nextInt();
		System.out.print("Nhập cạnh c:");
		int c=sc.nextInt();
		if(a<b+c && b<a+c && c<a+b) {
			System.out.println("Là 3 cạnh của tam giác");
			if( a==b && b==c && c==a ){
				System.out.println("Là tam giác đều");
			}
			else if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b) {
					System.out.println("Là tam giác vuông");
			}
			else if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b &&
					(a == b) || (b == c) || (c == a)) {
				System.out.println("Là tam giác vuông cân");
			}
			else if(a == b || b == c || c == a) {
				System.out.println("Là tam giác cân");
			}
			else {
				System.out.println("Là tam giác thường");
			}
		}
		else {
			System.out.println("Đây không phải tam giác !");
		}

	}

}
