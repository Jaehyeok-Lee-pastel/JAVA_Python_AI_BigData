package ch03;

public class LogicalOpt {

	public static void main(String[] args) {
		//논리연산자
		boolean a = true;
		boolean b = false;
		
		// AND(&&) : 조건 모두 체크
		System.out.println( (a && b) );
			
		// OR(||) : 경우에 따라서 하나만 체크(하나라도 참이면 true)
		System.out.println( (a || b) );

		// NOT (!) 
		System.out.println( !a );	
	}
}
