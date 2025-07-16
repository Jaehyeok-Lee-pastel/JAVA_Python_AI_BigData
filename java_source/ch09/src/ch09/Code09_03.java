package ch09;

import java.util.Scanner;

public class Code09_03 {

	public static void main(String[] args) {
		// 스캐너를 활용하여
		// 정수 4개를 입력받고 반복문을 이용해 입력받은 후
		// 합을 구하여라
		
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[4]; 
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("정수 출력 >> ");
			nums[i] = sc.nextInt();
		}
		
		
		// 향상된 for
		int sum = 0;
		for (int n : nums) {
			System.out.println(n);
			sum += n;
		}
		System.out.println(sum);
		sc.close();

	}

}
