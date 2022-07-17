package Bai1;

import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ngày sinh:");
		int day = sc.nextInt();
		System.out.print("Nhập tháng sinh:");
		int month = sc.nextInt();
		System.out.print("Nhập năm sinh:");
		int year = sc.nextInt();
		if(day>=20 && month == 1 || day<=28 & month == 2) {
			System.out.println("Bạn thuộc cung Bảo Bình !");
		}
		else if(day>=19 && month == 2 || day<=20 & month == 3) {
			System.out.println("Bạn thuộc cung Song Ngư !");
		}
		else if(day>=21 && month == 3 || day<=20 & month == 4) {
			System.out.println("Bạn thuộc cung Bạch Dương !");
		}
		else if(day>=21 && month == 4 || day<=20 & month == 5) {
			System.out.println("Bạn thuộc cung Kim Ngưu !");
		}
		else if(day>=21 && month == 5 || day<=21 & month == 6) {
			System.out.println("Bạn thuộc cung Song Tử !");
		}
		else if(day>=22 && month == 6 || day<=22 & month == 7) {
			System.out.println("Bạn thuộc cung Cự Giải !");
		}
		else if(day>=23 && month == 7 || day<=22 & month == 8) {
			System.out.println("Bạn thuộc cung Sư Tử !");
		}
		else if(day>=23 && month == 8 || day<=22 & month == 9) {
			System.out.println("Bạn thuộc cung Xử Nữ !");
		}
		else if(day>=23&& month == 9 || day<=23 & month == 10) {
			System.out.println("Bạn thuộc cung Thiên Bình !");
		}
		else if(day>=24 && month == 10 || day<=22 & month == 11) {
			System.out.println("Bạn thuộc cung Bọ Cạp !");
		}
		else if(day>=23 && month == 11 || day<=21 & month == 12) {
			System.out.println("Bạn thuộc cung Nhân Mã !");
		}
		else if(day>=22 && month == 12 || day<=19 & month == 1) {
			System.out.println("Bạn thuộc cung Ma Kết !");
		}
	}

}
