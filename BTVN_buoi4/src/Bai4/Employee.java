package Bai4;

import java.util.Scanner;

public class Employee {
	private String id;
	private String name;
	private int age;
	private int workingsDay;
	private double salary;
	public static final int PRICE=50;
	Employee(){
		
	}
	Employee(String id,String name, int age, int workingsDay){
		this.id = id;
		this.name = name;
		this.age = age;
		this.workingsDay = workingsDay;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setWorkingsDay(int workingsDay) {
		this.workingsDay = workingsDay;
	}
	public int getWorkingsDay() {
		return workingsDay;
	}
	public double getSalary() {
		return workingsDay* PRICE;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập id:");
		id = sc.nextLine();
		System.out.print("Nhập name:");
		name = sc.nextLine();
		System.out.print("Nhập age:");
		age = sc.nextInt();
		System.out.print("Nhập WorkingsDay:");
		workingsDay = sc.nextInt();
	}
	public void ouput() {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("WorkingsDay:"+workingsDay);
		System.out.println("Salary:"+getSalary());
	}
}
