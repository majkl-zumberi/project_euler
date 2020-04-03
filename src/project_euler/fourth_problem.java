package project_euler;

public class fourth_problem {

	
	
	public static boolean isPalindrome(int number) {
		//int n=10;
		String s=String.valueOf(number);
		String palindrome="";
		
		for (int i = s.length()-1; i >=0; i--) {
			palindrome+=s.charAt(i);
			//System.out.println(s.charAt(i));
		}
		//System.out.println(palindrome);
		if(palindrome.equals(s)) {
			//System.out.println("palindrome number ");
			return true;
		}
		else {
			//System.out.println("not palindrome number ");
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		 * Find the largest palindrome made from the product of two 3-digit numbers.
		 * */
		int max=0;
		int maxedI=0,maxedJ=0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 001; j <= 999; j++) {
				
				boolean palindrome=isPalindrome(i*j);
				if(palindrome) {
					//System.out.println("palindrome number: "+i*j+ " "+" i: "+i+" j: "+j);
					if(max<(i*j)) {
						max=i*j;
						maxedI=i;
						maxedJ=j;
					}
					
				}
				/*else {
					System.out.println("not a palindrome number ");
				}*/
			}
		}
		System.out.println("il più grande palindromo di 3 cifre è: "+max+" fatto da: "+maxedI+"*"+maxedJ);
		
		
	}

}
