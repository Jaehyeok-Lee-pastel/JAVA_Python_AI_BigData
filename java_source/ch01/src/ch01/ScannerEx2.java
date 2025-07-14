package ch01;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in); // 사용 준비
		
		System.out.print("소수점 2자리 실수를 입력하세요 > ");
		
		double d = sc2.nextDouble();
		System.out.print("입력된 소수점 2자리 실수는 "+ d +"입니다");

	}

}
