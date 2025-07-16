package ch10;

class Hello {
	public void hi() {
		System.out.println("양정인력개발센터입니다.");
	}
	
	
	public void welcome(String company) {
		System.out.println(company+"입니다.");
	}
	
	public String sayHello(String username) {
		return username;
	}
}


public class MethodEx4 {
	
	
	public static void disp() {
		System.out.println("부산광역시 IT 개발");
	}
	
	public static void disp(String company) {
		System.out.println(company);
	} // 오버로딩
	
	public static void disp(String company, int age) {
		System.out.println(company+","+age);
	} // 오버로딩
	
	// 아이디, 비밀번호
	public static void login(String userid, String userpwd) {
		System.out.println("아이디 : "+userid+", 비밀번호 : " + userpwd);
	}
	
	// 아이디, 비밀번호, 이름

	public static void login(String userid, String userpwd, String username) {
		System.out.println("아이디 : "+userid+", 비밀번호 : " + userpwd + ", 이름 : "+ username );
	}
	
	
	
	public static void main(String[] args) {
		// 텍스트 출력 : 객체 방식, static -> void 사용
		
		Hello h = new Hello();
		h.hi();
		h.welcome("양정인력개발센터");
		h.sayHello("username");
		System.out.println(h.sayHello("username"));
		disp();
		disp("IT 개발센터");
		disp("IT 개발센터", 2025);
		
		login("username", "password");
		login("username", "password", "name");
		
	}

}
