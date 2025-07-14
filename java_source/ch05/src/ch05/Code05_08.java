package ch05;

import java.util.Scanner;

public class Code05_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 점수를 입력해주세요.");
		int score = sc.nextInt();
		String grade = null;
		
		if (score >= 90)
			grade = "A";
		else if ( score >= 80)
			grade = "B";
		else if ( score >= 70)
			grade = "C";
		else if ( score >= 60)
			grade = "D";
		else
			grade = "F";
		
		System.out.println(grade + "학점입니다.");
		
		sc.close();
		
		
	}

}
