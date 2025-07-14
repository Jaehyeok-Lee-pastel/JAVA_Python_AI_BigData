package ch02;

public class FloatDoubleEx {

	public static void main(String[] args) {
		//원주율(파이) 저장 - 고정값 - pi - 3.14159 - float
		//중력가속도 저장 - 변수값 - gravity - double
		
		final float PI = 3.14159f; // final -> 값을 바꾸면 안될 때의 문법, 값이 바뀌면 안되는 상수값일경우 변수는 대문자로
		double GRAVITY = 9.80665;
		
		System.out.println("원주율 : "+ PI);
		System.out.println("중력가속도 : " +GRAVITY+ "m/s2");
	}

}
