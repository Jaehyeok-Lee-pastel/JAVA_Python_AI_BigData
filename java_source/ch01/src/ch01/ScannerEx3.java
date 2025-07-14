package ch01;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용 준비
		
		System.out.print("이름 : ");
		String uname = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println(uname + "님의 나이는 " + age + "살 입니다.");
	}

}
