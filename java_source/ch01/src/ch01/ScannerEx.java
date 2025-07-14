package ch01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용 준비
		
		System.out.print("정수를 입력하세요 > ");
		
		int num = sc.nextInt();
		System.out.print("스캐너를 통한 입력한 정수는 "+ num +"입니다");

	}

}
