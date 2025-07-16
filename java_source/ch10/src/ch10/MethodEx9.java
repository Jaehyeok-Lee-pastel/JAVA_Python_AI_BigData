package ch10;


class Ex9 {
	public int arr_sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

public class MethodEx9 {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
		
		Ex9 ex9 = new Ex9();
		int res = ex9.arr_sum(nums);
		System.out.println(res);
	}

}
