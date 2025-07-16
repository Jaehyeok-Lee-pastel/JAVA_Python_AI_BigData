package ch10;

class Calc { // 계산기 프로그램 방
//	 메소드 = 동작 = 더하기 동작
	 public int add(int num1, int num2) {
		 return num1 + num2;
	 }
	
	 public int mul(int x, int y, int z) {
		 return x * y * z;
	 }
	 
	 
	 // 빼기, 나누기는 음수가 나오면 x
	 public int minus(int a, int b) {
		 return a - b;
	 }
	 
	 public double avg(int c, int d) {
		 return c / d;
	 }
}

class Display {
	// 글자 출력은 void(없다 - return까지 없다\}
	
	//프로그램명 : 양정 계삭기 ver1.0
	public void title() {
		System.out.println("양정 계산기 ver 1.0");
	}
	
	public void end() {
		System.out.println();
	}
	
	//프로그램 종료 메시지 출력 : 프로그램 종료
	
	
	//프로그램 종료 메시지 출력
	
	
}


public class MethodEx1 {

	public static void main(String[] args) {
		// 내(팀장) 더하기 프로그램을 다른사람과 공유 또는 나눠 써야한다
		
		Calc c = new Calc(); // 객체 초기화 -> new 타입()

		System.out.println(c.add(10, 20));
		System.out.println(c.mul(10, 20, 15));
		
		
		int result = c.minus(-100, 50);
		if(result > 0) {
			System.out.println(result);
		} else {
			System.out.println("음수값은 사용할 수 없습니다. \n다시 입력하세요.");
		}
		
		System.out.println(c.avg(9, 3));
	}
}
