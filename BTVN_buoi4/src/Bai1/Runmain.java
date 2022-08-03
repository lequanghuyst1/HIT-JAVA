package Bai1;

public class Runmain {

	public static void main(String[] args) {
		HinhChuNhat h1 = new HinhChuNhat();
		HinhChuNhat h2 = new HinhChuNhat();
		h1.input();
		System.out.print("Thông tin hình chữ nhật 1");
		h1.output();
		h2.setA(4);
		h2.setB(3);
		System.out.println("");
		System.out.print("Thông tin hình chữ nhật 2");
		h2.output();
		if(h1.dientich()>h2.dientich()) {
			System.out.println("H1 có diện tích lớn hơn");
		}
		else {
			System.out.println("H2 có diện tích lớn hơn");
		}
	}

}
