package ch05;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		
		// 국어 점수가 90이상인 학생중에서 95점 이상이면 A+, 90점 이상이면 A-
		// 국어 점수가 80이상인 학생중에서 85점 이상이면 B+, 80점 이상이면 B-
		// 나머지는 F
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int score = sc.nextInt();
		String grade = null;
		
		if (score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A-";
			}
		} else if (score >= 80) {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B-";
			}
		} else {
			grade = "F";
		}
		
		System.out.println("당신의 학점은 " + grade + "학점입니다.");
		
		sc.close();
	}

}
