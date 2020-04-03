package project_euler;

public class fourtheenth_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *
		The following iterative sequence is defined for the set of positive integers:
		
		n → n/2 (n is even)
		n → 3n + 1 (n is odd)
		
		Using the rule above and starting with 13, we generate the following sequence:
		
		13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
		It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
		
		Which starting number, under one million, produces the longest chain?
		
		NOTE: Once the chain starts the terms are allowed to go above one million.*/
		long collatz=13;
		long starting_number=13;
		long i=1;
		for (long j = 0; i<1000000; j++) {
			for (i=1; collatz!=1; i++) {
				if(collatz%2==0) {// is even
					collatz/=2;
					//System.out.println(collatz);
					//continue;
				}
				else { //else is odd
					collatz=(3*collatz)+1;
					//System.out.println(collatz);
					//continue;
				}
				
			}
			starting_number++;
		}
			
		System.out.println(i+" terms, the starting number is: "+(starting_number-1));
		
	}

}
