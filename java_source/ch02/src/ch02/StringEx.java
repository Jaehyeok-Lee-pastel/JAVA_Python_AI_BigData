package ch02;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("안녕하세요, "+ name +"님 ");
		
		sc.close();

	}

}
