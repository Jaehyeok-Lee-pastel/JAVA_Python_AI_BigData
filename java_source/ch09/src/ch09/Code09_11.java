package ch09;

public class Code09_11 {

	public static void main(String[] args) {
		// 타입[][] 이름 = new 타입[행 개수][열 개수];
		
		// 2행(A, B) 3열 (1, 2, 3) -> 좌석 6개 예약 프로그램
		
		String[][] seats = new String[2][3];
		
		seats[0][0] = "A-1";
		seats[0][1] = "A-2";
		seats[0][2] = "A-3";
		
		seats[1][0] = "B-1";
		seats[1][1] = "B-2";
		seats[1][2] = "B-3";
		
		
		//행(i), 열(j)
		for (int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println(seats[i][j]);
			}
		}
		
		// length를 이용한 for
		// 2차원 length는 1차원 사용과 동일	
		for (int i = 0; i<seats.length; i++) {
			for(int j = 0; j<seats[i].length; j++) {
				System.out.println(seats[i][j]);
			}
		}
	}
}
