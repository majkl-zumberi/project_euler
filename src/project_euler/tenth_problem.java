package project_euler;

public class tenth_problem {

	public static boolean isPrime(long num) {
		
		for (long j = 2; j <=num/2; j+=2) {
			if(num%j==0) {
				return false;
			}
		}
		return true;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

		   Find the sum of all the primes below two million.*/
		long sum=0;
		for (long i = 2; i < 2000000; i++) {
			boolean prime=isPrime(i);
			if(prime) {
				sum+=i;
				
			}
		}
		System.out.println(sum);
		
	}

}
