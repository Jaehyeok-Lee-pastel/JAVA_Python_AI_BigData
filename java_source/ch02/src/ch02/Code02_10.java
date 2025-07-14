package ch02;

import java.util.Scanner;

public class Code02_10 {

	public static void main(String[] args) {
		// 정수 2개를 Scanner를 통해 입력 받아 출력하는 프로그램을 완성하시오.
		Scanner s = new Scanner(System.in); // 버퍼 열림
		
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = s.nextInt();
		
		System.out.print("두번째 정수 입력 >> ");
		int num2 = s.nextInt();
		
		System.out.println("두 수를 더해서 출력합니다.");
		System.out.println(num1 + num2);
		
		
		s.close();
	
	}

}
