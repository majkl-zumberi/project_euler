package project_euler;

public class first_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		//Find the sum of all the multiples of 3 or 5 below 1000.
		
		int sum=0;
		int i=0;
		while(i<1000) {
			
			if(i%3==0 || i%5==0) {
				sum+=i;
				//System.out.println(i);
			}
			i++;	
		}
		
		System.out.println(sum);
	}

}
