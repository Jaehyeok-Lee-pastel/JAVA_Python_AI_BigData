package ch09;

import java.util.Scanner;

public class Code09_02 {

	public static void main(String[] args) {
		// 스캐너로 임의의 숫자 3개를 입력 받아 배열에 저장한 후
		// 그 합을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		
		System.out.print("첫번째 정수 입력 > ");
		num[0] = sc.nextInt();
		
		System.out.print("두번째 정수 입력 > ");
		num[1] = sc.nextInt();
		
		System.out.print("세번째 정수 입력 > ");
		num[2] = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		System.out.print("정수 3개의 합 > " + sum);
		
		
		sc.close();
		
	}

}
