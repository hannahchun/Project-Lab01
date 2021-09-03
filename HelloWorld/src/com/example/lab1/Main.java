package com.example.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!!!\n");
		System.out.print("이름 입력:");
		String name = s.next();
		System.out.print("나이 입력:");
		int age = s.nextInt();
		s.nextLine();
		System.out.print("전공 입력:");
		String major = s.nextLine();
		System.out.println("name: "+ name); 
		System.out.println("age: " + age); 
		System.out.println("major: " + major);
	}

}
