package project_euler;

public class sixth_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640. Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		 * */
		
		int sum_square_nrs=0;
		int square_sum=0;
		int difference=0;
		for (int i = 1; i <= 100; i++) {
			sum_square_nrs+=Math.pow(i, 2);
		}
		//System.out.println(sum_square_nrs);
		
		for (int j = 1; j <= 100; j++) {
			square_sum+=j;
		}
		//System.out.println(square_sum);
		square_sum=(int) Math.pow(square_sum, 2);
		//System.out.println(square_sum);
		difference=square_sum-sum_square_nrs;
		System.out.println(difference);
	}
	 
}
