package ch02;

public class CharStringEx {

	public static void main(String[] args) {
		// 문자 또는 문자열(기본형-소문자), 문자열(참조형 - 다른프로그램은 배열)
		// '',    ""
		// 등급 : ABCD
		// A+
		char grade = 'A';
		String level = "A+"; // 기본형 방법
		
		String grade2 = new String("A+");  // 참조형 방법
		
		System.out.println("너의 성적은 "+ grade +"입니다.");
		
		
		
		// 변수에 값을 넣는 것은 초기화
		// 정수형
		// 100+200 = 300
		int num1 = 100;
		int num2 = 200;
//		System.out.println(num1+num2);

		// 아직 넣을 값을 모를때
		int n1 = 0;
		int n2 = 0;
		
		n1 = 100;
		n2 = 200;
		System.out.println(n1+n2);
		
		
		// 실수형
		double d1 = 0.1;
		double d2 = 0.2;
		System.out.println(d1+d2);
		
		double d3 = 0.0;
		double d4 = 0.0;
		
		d3 = 0.5;
		d4 = 0.7;
		System.out.println(d3+d4);
		
		// 문자(열)
		char score = 'A';
		String name = "ㅇㅅㅇ"; // 기본형
		String hello = new String("hello"); // 참조형
		
		char score1 = ' ';
		String name1 = "";
		String hello1 = null; // 참조형에서 빈 값을 넣을 때는 null
		
		
		// boolean
		// 참, 거짓 - true, false
		
		boolean gender = true;
		boolean gender2 = false; // 잘 모르겠을땐 false 넣고 시작
	}
}
