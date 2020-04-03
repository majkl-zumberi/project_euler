package project_euler;

public class thirthysixth_problem {

	public static boolean isPalindrome(String base_ten, String base_two) {
		String reversed_base_ten="";
		String reversed_base_two="";
		for (int i = base_ten.length()-1; i >=0; i--) {
			reversed_base_ten+=base_ten.charAt(i);
		}
		for (int i = base_two.length()-1; i >=0; i--) {
			reversed_base_two+=base_two.charAt(i);
		}
		return reversed_base_ten.equalsIgnoreCase(base_ten) && reversed_base_two.equalsIgnoreCase(base_two);
	}

	public static String binary(int base_ten) {
		String base_two="";
		String base_two_reversed="";
		do {
			base_two+=base_ten%2;
			base_ten/=2;
		}
		while(base_ten!=0);
		for (int i = base_two.length()-1; i>=0 ; i--) {
			base_two_reversed+=base_two.charAt(i);
		}
		return base_two_reversed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.

			Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
			
			(Please note that the palindromic number, in either base, may not include leading zeros.)*/
		String binary="";
		long sum=0;
		for (int i = 1; i < 1000000; i++) {
			binary=binary(i);
			boolean isPalindrome=isPalindrome(String.valueOf(i), binary);
			if(isPalindrome) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

}
