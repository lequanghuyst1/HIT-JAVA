package Bai1;
import java.util.Scanner;

public class Runmain {
	static Scanner sc = new Scanner(System.in);
	public static void nhap(int a[],int n) {
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
	}
	public static void xuat(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public static void tong_so_le(int a[], int n) {
		int tong=0;
		for(int i=0;i<n;i+=2) {
			if(a[i]%2==1) {
				tong+=a[i];
			}
		}
		System.out.println("Tổng các số lẻ ở vị trí chẵn là: "+tong);
		
	}
	public static void vitri_min(int a[],int n) {
		int min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.print("Vị trí số nhỏ nhất: ");
		for(int i=0;i<n;i++) {
			if(a[i]==min) {
				System.out.print(i+1+" ");
			}
		}
		System.out.println("");
	}
	public static Boolean ktr_soChinhPhuong(int n) {
		int socp = (int)Math.sqrt(n);
        if(socp*socp == n) {
            return true;
        }
        return false;
	}
	public static void tim_socp(int a[], int n) {
		System.out.print("Các số chính phương: ");
		for(int i=0;i<n;i++) {
			if(ktr_soChinhPhuong(a[i])) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("");
	}
	public static void sap_xep(int a[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int tg = a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}		
		System.out.print("Mảng sau khi sắp xếp: ");
		xuat(a,n);
	}
	public static void main(String[] args) {
		System.out.print("Nhập n:");
		int n=sc.nextInt();
		int[] a = new int[n];
		nhap(a,n);
		System.out.print("Mảng vừa nhập: ");
		xuat(a,n);
		tong_so_le(a,n);
		vitri_min(a,n);
		tim_socp(a,n);
		sap_xep(a,n);
		}
}
