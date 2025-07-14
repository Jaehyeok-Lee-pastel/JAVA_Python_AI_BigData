package ch04;

public class Code04_08 {

	public static void main(String[] args) {
		String var1 = "난생처음 \n자바를 \n열공중입니다.";
		System.out.println(var1);

		String s = "난생 처음 자바";
		int len = s.length();
		System.out.println(len);

		String cID = "yj001001001";
		int lenID = cID.length();
		System.out.println("우리 회사의 사번은 "+lenID+"입니다.");
		
		
		//trim()
		String userid = " busan it ";
		System.out.println(userid.trim());
		
		//replaceALL
		System.out.println(userid.replaceAll(" ", ""));
	
		//indexOF("글자")
		String email = "mail@mail.com";
		System.out.println(email.indexOf("@"));
		
		if (email.indexOf("@") < 0) {
			System.out.println("사용할 수 없는 이메일 주소입니다.");
		} else {
			System.out.println("사용 가능 합니다.");
		}
		
		// 문자열 비교

		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		
		
		// 기본 타입의 String은 메모리 주소를 비교
		System.out.println(s1 == s2);
		
		
		// 내용은 equals()
		System.out.println(s1.equals(s2));
		
		//
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		// 필요한 문자 잘라내기
		String sub = "Java Pro";
		//       	  01234567
		String cut = sub.substring(5,8);
		System.out.println(cut);
		
		String jumin = "001234-1234567";
		String gender= jumin.substring(7, 8);
		System.out.println(gender);
	}

}
