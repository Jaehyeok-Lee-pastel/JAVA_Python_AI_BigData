package ch10;

class Ex10 {
	
	int add(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}


public class MethodEx10 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		
		Ex10 ex10 = new Ex10();
		System.out.println(ex10.add(arr));
	}

}
