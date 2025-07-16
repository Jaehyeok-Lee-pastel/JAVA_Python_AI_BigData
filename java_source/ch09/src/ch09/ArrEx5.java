package ch09;

public class ArrEx5 {

	public static void main(String[] args) {
		// 1. (고정)배열 - 타입일치 : 반복 작업 -> 유지보수
		// 선언 + 초기화
		// 타입[] 배열명 = new 타입[개수];
		// 초기화 작업
		
		// yes24 -> 책 3개를 등록해야된다
		
		// for (초기값; 조건문; 증감값;){
	//			출력문
	//		}
		
		// 일반 for
//		String[] books = new String[3]; // 개수는 1~, 인덱스는 0~
//		books[0] = "자바 프로그래밍";
//		books[1] = null;
//		books[2] = "웹 프로그래밍";
//		
//		for (int i = 0; i < books.length; i++) {
//			System.out.println(books[i]);
			
			
			
		//선언 + 초기화 = 동시화
		//타입[] 배열명 = {값1, 값2, 값3}
		//키 -> 실수 -> double
		
		
//		double[] heights = {180.1, 190.2, 0.0};
//		for (int i = 0; i < heights.length; i++) {
//		System.out.println(heights[i]);
//		}
		
		// 1번 + 2번 = 3번
		// 타입[] 배열명 = new 타입[] {값1, 값2, 값3}

//		String[] items = new String[] {
//				"여성의류", null, "남성의류"
//		};
//		for (int i = 0; i < items.length; i++) 
//			System.out.println(items[i]);
		
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);
		
		
		
	}
}
