package ch03;

import java.util.Scanner;

public class Code03_10 {

	public static void main(String[] args) {
		//스캐너를 통해서 1 ~ 100사이의 정수를 입력 받은 후
		// 70이상일 때 결과를 표시하시오.
		
		Scanner sc = new Scanner(System.in); // new 객체명 - 생성자(객체 초기화)
		System.out.println("1에서 100 점수를 입력하시오");
		int score = sc.nextInt();
		
		System.out.println(score >= 70);
		
		sc.close();
		
	}

}
