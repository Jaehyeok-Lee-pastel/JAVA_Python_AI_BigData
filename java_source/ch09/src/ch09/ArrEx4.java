package ch09;

public class ArrEx4 {

	public static void main(String[] args) {
		// 학생 2명의 키를 입력하시오.
		// 타입[] 변수명 = new 타입[배열개수];
		// 향상된 for 사용
		
		
		double[] heights = new double[3];
		
		heights[0] = 172.5;
		heights[1] = 177.3;
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println(heights[i]);
		}
		
		// 아이디 3개 -> 값은 2개만
		// 문자열타입[] 변수명 = new 문자열타입[개수];
		
		String[] userid = new String[3];
		
		userid[0] = "busan";
		userid[1] = "yj";
		
		// for(타입 별명 : 배열명) {
		//	System.out.println(별명)
		//}
		
		for (String s : userid) {
			System.out.println(s);
		}
		

	}

}
