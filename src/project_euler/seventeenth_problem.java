package project_euler;

public class seventeenth_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
		If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
		NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
		 * */
		
		String[] numbers_one_twenty= {
				"zero",
				"one",
				"two",
				"three",
				"four",
				"five",
				"six",
				"seven",
				"eight",
				"nine",
				"ten",
				"eleven",
				"twelve",
				"thirteen",
				"fourteen",
				"fifteen",
				"sixteen",
				"seventeen",
				"eighteen",
				"nineteen"
				};
		String[] decimals= {
				"ten",
				"twenty",
				"thirthy",
				"forty",
				"fifty",
				"sixty",
				"seventy",
				"eighty",
				"ninety",
				"hundred"
		};
		
		String number="onethousand";
		long lenght_number=number.length();
		for (int i = 1; i <= 1000; i++) {
			int len=String.valueOf(i).length();
			for (int j = 0; j <= len; j++) {
				
			}
		}
		

	}

}
