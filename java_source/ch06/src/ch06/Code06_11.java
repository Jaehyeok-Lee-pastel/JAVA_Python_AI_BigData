package ch06;

import java.util.Scanner;

public class Code06_11 {

	public static void main(String[] args) {
		// 무한루프
		// 멈추는 방법.
		// 1. 이클립스 정지 버튼
		// 2. Scanner
		// 3. System.exit()
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수입력");
			int num = sc.nextInt();
		}

	}

}
