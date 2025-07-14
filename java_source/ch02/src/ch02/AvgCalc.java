package ch02;

import java.util.Scanner;

public class AvgCalc {

	public static void main(String[] args) {
		// 두 실수를 입력받아서 평균을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== 평균 계산기 ==========");
		System.out.println("첫번째 실수를 입력하세요. ");
		double num1 = sc.nextDouble();
		
		System.out.println("두번째 실수를 입력하세요. ");
		double num2 = sc.nextDouble();
		
		double avg = (num1 + num2) / 2;
		System.out.println("평균은 " + avg +"입니다.");
		
		System.out.print("==============================");
		
		sc.close();
	}

}
