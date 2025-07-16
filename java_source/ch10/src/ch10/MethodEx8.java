package ch10;

class Example8 {
	
	public void greet(String username) {
		System.out.println(username + "님, 안녕하세요");
		
	}
}



public class MethodEx8 {

	public static void main(String[] args) {
		Example8 ex8 = new Example8();
		ex8.greet("길동");

	}

}
