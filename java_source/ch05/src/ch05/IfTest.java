package ch05;

public class IfTest {

	public static void main(String[] args) {
		
		// 수학 점수를 관리한다.
		// 점수는 1 ~ 100 사이의 점수를 입력한다.
		// 변수명은 score
		// 60점 이상이면 합격 아니면 불합격으로 표시하시오.
		
		byte math = 65;
		
		
		if(math>60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
	}

}
