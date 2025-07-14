package ch06;

public class Code06_09 {

	public static void main(String[] args) {
		// 1차원 : Vector : 열 - for 한번
		// 2차원 : Matrix : 행 - for -2번
		
		// 구구단 2단 : 2*1, 2*2---
		
 		for (int i = 2; i<10; i++) {
			for (int j = 1; j< 10; j++) {				
				System.out.println(i + "X" + j + " = " + (i * j));
			}
		}
	}
}
