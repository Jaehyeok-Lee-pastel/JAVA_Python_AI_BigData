package ch05;

import java.util.Scanner;

public class Code05_05 {

	public static void main(String[] args) {
		//스캐너를 통해 임의의 변수를 입력받아 나머지가 0이면 짝수,
		//아니면 홀수를 출력하시오.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 정수 입력 >> ");
		int i = sc.nextInt();
		
		if(i%2 == 0) 
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
		sc.close();
		
		
	}

}
