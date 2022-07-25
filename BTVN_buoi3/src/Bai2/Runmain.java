package Bai2;

import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi:");
		String s= sc.nextLine();
		String s1 = s.trim();
		String s2 = s1.replaceAll("\\s+"," ");
		String s3 = s2.replaceAll("[0-9]","");
		String s4[] = s3.split(" ");
		String sname ="";
		for(int i=0;i<s4.length;i++) {
			sname = sname.concat(s4[i].substring(0, 1).toUpperCase().concat(s4[i].substring(1)+" "));
		}
		System.out.println("Output:"+sname);
	}
}
