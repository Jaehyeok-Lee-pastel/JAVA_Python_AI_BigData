package ch02;

import java.util.Scanner;

public class LettersInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 이름을 입력하세요(a~Z) >> ");
		String username = sc.nextLine();
		
		// 영어 대소문자로 입력했다면 출력
		if(username.matches("[a-zA-Z]+") ) {
			System.out.println("입력한 이름은 "+ username +"입니다");
		} else { // 아니면 에러메시지 출력
			System.out.println("영어로 된 이름만 사용할 수 있습니다.");
		}
	
		sc.close();
	}

}
