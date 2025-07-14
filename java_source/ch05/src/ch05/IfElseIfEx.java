package ch05;

//import java.util.Scanner;

public class IfElseIfEx {

	public static void main(String[] args) {
		//score 변수의 값이 90보다 크면 "A학점"
		//score 변수의 값이 80보다 크면 "B학점"
		//score 변수의 값이 70보다 크면 "C학점"
		//그 외에는 "F학점"으로 표시하시오.
		
//		Scanner sc = new Scanner(System.in);
		int score = 88;
		
		if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80) 
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else
			System.out.println("F학점");
//		sc.close();
		
		
		//(전역)변수 이용
		
		String grade = "";
		
		if( score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";	
		else 
			grade = "F";
		
		System.out.println(grade+"학점");
		
	}

}
