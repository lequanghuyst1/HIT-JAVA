package Bai3;

public class Runmain {
	public static boolean isPrime(int n) {
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(long n) {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	public static boolean isPrime(float n) {
		if(n == (int)n) {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime(double n) {
		if(n == (int)n) {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isPrime(5));       	//int
		System.out.println(isPrime(12));		//int
        System.out.println(isPrime(1021));		//long      
        System.out.println(isPrime(1024));		//long   
        System.out.println(isPrime(7.0)); 		//float   
        System.out.println(isPrime(7.5)); 		//float 
        System.out.println(isPrime(17.0));  	//double    
        System.out.println(isPrime(17.345));   	//double

	}

}
