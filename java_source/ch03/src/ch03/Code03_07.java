package ch03;

public class Code03_07 {

	public static void main(String[] args) {
		//파싱(변환)
		//정수 2개를 담는 변수를 선언한 후 초기화 하여 두 수를 더하시오.
		
		int num1, num2;
		num1 = 100;
		num2 = 200;
		int res = num1 + num2;
		System.out.println(res);
		
		// 산술 연산 -> 변환
		String str1, str2;
		str1 = "100";
		str2 = "200";
		
		int num3 = Integer.parseInt(str1);
		int num4 = Integer.parseInt(str2);
		int res2 = num3 + num4;
		System.out.println(res2);
		

	}

}
