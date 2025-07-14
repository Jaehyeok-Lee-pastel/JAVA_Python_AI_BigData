package ch03;

public class Code03_09 {

	public static void main(String[] args) {
		// 변수 선언(정수 타입) + 초기화
		
		int num = 20;
		
		// 증감 연산자 : ++변수, 변수++, --변수, 변수--
		// 앞에 붙으면 더하거나(뺀후) 화면 출력
		// 뒤에 붙으면 출력한 후에 더하거나(빼기)
		
		++num;
		System.out.println(num);
		num++;
		System.out.println(num);

		--num;
		System.out.println(num);
		num--;
		
	}

}
