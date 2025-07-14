package ch01;

public class LoginCheck {

	public static void main(String[] args) {
		String userid = "yangjung";
		String passwd = "12345";
		
		String dbUID = "yangjung";
		String dbPWD = "12345";

		if ( userid.equals(dbUID) && passwd.equals(dbPWD) ) {
			System.out.println("안녕하세요. "+ userid +"님");
			System.out.println("마이페이지로 이동합니다.");
		} else {
			
			System.out.println("로그인에 실패했습니다");
		}
		
	}

}
