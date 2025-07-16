package ch10;


class Ex11 {
	
	public int sum(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		return res;
	}
	
}



public class Method11 {

	public static void main(String[] args) {
		// 타입[] 배열명 = new 타입[] {1, 2, 3, 4, 5}
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		Ex11 ex11 = new Ex11();
		
		System.out.println(ex11.sum(arr));
		

	}

}
