package ch02;

public class Code2_3 {

	public static void main(String[] args) {
		// 2 * 8
		
			
		// Primitive Type(소문자) : 기본타입
		// Reference Type(대문자) -> new String() -> 저장공간 정확x
		// -> 참조타입
		
		// 정석은 String s1 = new String("안녕하세요")
		// String s = "안녕하세요"
		
		// 두개의 메모리 동작방식이 다름
		
		
		//정수형 : byte(1), short(2), int(4), long(8)
		//문자형 : char(2) : 음수x(~65000) -> 유니코드 문자 표시
		//실수형 : float(4), double(8)
		//bool타입 : boolean(1) => 0, 1
		
		// 4바이트 정수형 변수를 2개 만들어 100, 200을 저장한 후 합계를 출력하시오
		
	int num1 = 100;
	int num2 = 50;
	
	int res = num1 + num2;
	System.out.println(res);
	}

}
