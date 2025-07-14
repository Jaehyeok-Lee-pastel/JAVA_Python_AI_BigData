package ch03;

public class Lab03_03 {

	public static void main(String[] args) {
		int java, mobile, excel;
		java = 3;
		mobile = 2;
		excel = 1;
		double A, A0, B;
		A = 4.5;
		A0 = 4.0;
		B = 3.5;
		
		double avg;
		avg = ((java * B) + (mobile * A0) + (excel * A) / (java + mobile + excel));
		avg = Math.round(avg*100.0)/100.0;
		
		System.out.println(avg);
		

	}

}
