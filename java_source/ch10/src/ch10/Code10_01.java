package ch10;

// 주사위 구르는 방을 따로 만들고 동작(메서드)로 처리
// Dice / drawDice

class Dice {
	
	public int drawDice() {
		int diceNum = 0;
		diceNum = (int)(Math.random()*6) + 1;
		return diceNum; // 메인에서 사용하는 곳으로 결과를 전달
	}
}



public class Code10_01 {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println(d.drawDice());
	}
}

