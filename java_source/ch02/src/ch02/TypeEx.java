package ch02;

public class TypeEx {

	public static void main(String[] args) {
		// 쇼핑몰 상품 관리하기
		// 상품명 - S, 상품가격 - i , 할인율 - d, 
		// 재고여부 - b, 제품등급 - c
		
		String productName = "부산 노트북";
		int price = 1000000;
		double dcRate = 0.15; // float일경우 0.15f
		boolean inStock = true;
		char grade = 'B';
		
		System.out.println("할인율 : "+ (dcRate*100) +"%");
		
	}

}
