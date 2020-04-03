package project_euler;

public class third_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The prime factors of 13195 are 5, 7, 13 and 29.

		   What is the largest prime factor of the number 600851475143? 
		   metti L alla fine del numero */
	
		long dividendo = 600851475143L;
		int divisore;
		
		for (divisore = 2; divisore <= dividendo; divisore++) {
			if(dividendo % divisore == 0) {
				System.out.println( "divisore: "+divisore);
				dividendo =dividendo/divisore;
				System.out.println(dividendo);
				
			}
		}
		
	}

}
