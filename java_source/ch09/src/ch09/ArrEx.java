package ch09;

public class ArrEx {

	public static void main(String[] args) {
		// 배열 + for(반복문) : 데이터가 최소 100개 이상은 된다고 가정
		
		// 배열(고정배열) - 개수가 정해져 있다. 수정, 삭제시 속도가 빠르다.
		// -> []
		
		// 가변배열 - 개수가 정해져 있지 않다. 수정, 삭제시 속도는 느리다.
		// -> <>
		
		// 배열 : 같은 것들을 늘어놓은 것
		
		// 학생 3명의 수학 점수를 입력하시오.
		
		// 1번
		
		// 타입[] 변수명 = new 타입[개수]; -> 배열 선언
		
		int[] math = new int[3];
		
		// 구분 방법은 index
		// index는 0부터 시작
		
		math[0] = 70;
		math[1] = 80;
		math[2] = 90;
		
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		
		
		
		
	}

}
