package ch02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionHandling {

	public static void main(String[] args) {
		// try (정상코드) ~ catch (예외코드) ~ finally (무조건 한번은 실행)
		
		// 스캐너를 이용해서 데이터를 입력 받았을때 정수가 아니면 예외 발생
		Scanner sc = new Scanner(System.in);
		int num = 0; // 전역변수 
		
		try { // 정확하게 정수 입력 했을때 
			System.out.println("정수를 입력하시오.");
			num = sc.nextInt();
			System.out.println("입력한 정수는 " + num + "입니다.");
		} catch(InputMismatchException e) { // 비정상적일 때
			System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
		} finally { // 무조건 한번은 실행시켜야 하는코드
			sc.close();
		}
		
		
	}

}
