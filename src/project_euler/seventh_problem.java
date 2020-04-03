package project_euler;

public class seventh_problem {

	
	public static boolean isPrime(int num) {
		
			for (int j = 2; j <=num/2; j++) {
				if(num%j==0) {
					return false;
				}
			}
			return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. What is the 10 001st prime number?
		int contatore=0;
		int i=2;
		while(contatore<10001) {
			if(isPrime(i)) {
				System.out.println(i);
				contatore++;
			}
			i++;
		}
		/*for (int i = 2; i <= 15; i++) {
			if(is_prime=isPrime(i)) {
				System.out.println(i);
				contatore++;
			}
		}*/
		System.out.println(contatore);
	}

}
