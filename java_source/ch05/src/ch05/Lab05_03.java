package ch05;

import java.util.Scanner;

public class Lab05_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생연도를 입력하세요.");
		int year = sc.nextInt();
		
		String animal = null;
		
		switch(year%12) {
			case 0:
				animal = "원숭이";
				break;
				
			case 1:
				animal = "닭";
				break;
				
			case 2:
				animal = "개";
				break;
				
			case 3:
				animal = "돼지";
				break;
				
			case 4:
				animal = "쥐";
				break;
				
			case 5:
				animal = "소";
				break;
				
			case 6:
				animal = "호랑이";
				break;
				
			case 7:
				animal = "토끼";
				break;
				
			case 8:
				animal = "용";
				break;
				
			case 9:
				animal = "뱀";
				break;
				
			case 10:
				animal = "말";
				break;
				
			case 11:
				animal = "양";
			
		}
		System.out.println("당신의 띠는 "+ animal + "띠 입니다.");
		
		sc.close();

	}

}
