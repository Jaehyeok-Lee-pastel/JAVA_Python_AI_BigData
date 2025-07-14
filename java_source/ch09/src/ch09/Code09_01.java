package ch09;

import java.util.Scanner;

public class Code09_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int sum = 0;
		
		System.out.print("숫자 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("숫자 입력 : ");
		num2 = sc.nextInt();
		
		System.out.print("숫자 입력 : ");
		num3 = sc.nextInt();
		
		System.out.print("숫자 입력 : ");
		num4 = sc.nextInt();
		
		sum = num1 + num2 + num3 + num4;
		System.out.print("입력된 숫자의 합은 : " + sum);
		
		
		
		sc.close();

	}

}
