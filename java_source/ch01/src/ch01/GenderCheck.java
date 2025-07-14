package ch01;

public class GenderCheck {

	public static void main(String[] args) {
		String jumin = "001234-1534567";
		System.out.println((Object) jumin.getClass().getSimpleName());
		
		//. ~안에
		char genNumber = jumin.charAt(7);
		System.out.println(genNumber);
		System.out.println(((Object) genNumber).getClass().getSimpleName());
		
		if(genNumber % 2 == 0) {
			System.out.println("성별은 여자입니다.");
		} else {
			System.out.println("성별은 남자입니다.");
		}
		
		// .substring(시작번호, 번호앞(-1))
		String genderNum = jumin.substring(7, 8);
		System.out.println(genderNum);
		
		// 잘라낸 글자를 숫자로 변환
		int num = Integer.parseInt(genderNum);
		System.out.println(num);
		
        // 숫자 동등 비교 : true, false
		
		System.out.println( 1 == 2 );
		
		// 글자 동등 비교 : true, false
	
		System.out.println( "a".equals("B") );
	
	}

}
