package ch05;

import java.util.Scanner;

public class Lab05_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("나이 입력하세요.");
		age = sc.nextInt();
		
		if (age >= 18) 
			System.out.println("즐거운 시간 보내세요");
		else 
			System.out.println("집에 갈 시간이에요");
		System.out.println("협조 감사합니다.");
		
		
		
		sc.close();

	}

}
