package Bai3;


import java.util.Scanner;

public class Runmain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập n:");
			int n = sc.nextInt();
			int tong = 0;
			for(int i=1;i<=n;i++) {
				if(n%i == 0) {
					tong+=i;
				}
			}
			System.out.println("Tổng các ước của n = "+tong);
		}


	}



