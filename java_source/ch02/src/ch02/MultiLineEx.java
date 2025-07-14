package ch02;

import java.util.Scanner;

public class MultiLineEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어 입력");
		String word = sc.next();
		
		sc.nextLine(); // 이전 버퍼에 들어있는 데이터를 비우고 새로 준비
		
		System.out.println("문장 입력");
		String sentense = sc.nextLine();
		
		System.out.println("한 단어만 출력 : " + word);
		System.out.println("문장 출력 : " + sentense);
		
		sc.close();
	}

}
